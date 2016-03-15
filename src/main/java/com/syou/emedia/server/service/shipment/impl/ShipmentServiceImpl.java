package com.syou.emedia.server.service.shipment.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syou.emedia.server.mapper.shipment.PFShipmentMapper;
import com.syou.emedia.server.model.qrcode.PFQrcode;
import com.syou.emedia.server.model.shipment.PFShipment;
import com.syou.emedia.server.service.qrcode.IQrcodeService;
import com.syou.emedia.server.service.shipment.IShipmentService;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.CommodityInfo;
import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.ctrl.api.shipment.ShipmentReq;
import com.syou.emedia.web.ctrl.api.shipment.ShipmentRsp;
import com.syou.emedia.web.exceptions.BusinessException;

@Service("shipmentService")
@Transactional
public class ShipmentServiceImpl implements IShipmentService {

	@Autowired
	private PFShipmentMapper shipmentMapper;
	@Autowired
	private IQrcodeService qrcodeService;
	
	@Override
	public Response saveShipmentResult(ShipmentReq req) throws Exception {
		Response rsp = new Response();
		List<CommodityInfo> shipmentList = req.getCommodity_INFO_LIST();
		if(shipmentList.isEmpty()){
			throw new BusinessException(WebConstants.ERROR_CODE_1001, "出货信息不能为空");
		}
		List<String> temp = new ArrayList<String>();
		PFShipment record;
		for (CommodityInfo shipment : shipmentList) {
			record = new PFShipment();
			record.setCommodityId(shipment.getCommodity_ID());
			record.setTerminalId(req.getTer_INFO().getTer_ID());//记录是那台售票机上的出货信息
			record.setShipmentResult(shipment.getShipment_RESULT());//出货结果，0：成功，其他：失败
			if(!"0".equals(shipment.getShipment_RESULT())){
				temp.add(shipment.getCommodity_ID());
			}
			record.setShipmentDesc(shipment.getShipment_RESULT_DESC());
			record.setCreateTime(new Date());
			shipmentMapper.insert(record);
		}
		ShipmentRsp detail = new ShipmentRsp();
		if(!temp.isEmpty()){//表示存在出货失败的情况，重新激活二维码，赠送商品列表中剔除已出货成功的 at 2016/02/21
			PFQrcode qrcode = qrcodeService.queryQrcodeById(Integer.valueOf(req.getQr_CODE_ID()));
			List<String> unmodifiedClist = Arrays.asList(qrcode.getQrCode().split(";"));
			List<String> commodityIdList = new ArrayList<String>(unmodifiedClist);
			commodityIdList.removeAll(temp);
			//重新修改二维码信息：修改赠送商品清单信息，修改二维码状态及失效时间
			qrcode.setQrCode(StringUtils.join(commodityIdList.iterator(), ";"));
			qrcode.setExpireTime(new Date((new Date()).getTime()+10*6*1000));
			qrcode.setStatus(WebConstants.VALID);
			qrcodeService.updateQrcode(qrcode);
		}
		detail.setResult(WebConstants.SUCCESS_CODE_0000);
		rsp.setDetail(detail);
		rsp.setStateCode(WebConstants.SUCCESS_CODE_0000);
		rsp.setMessage("返回成功");
		return rsp;
	}
}
