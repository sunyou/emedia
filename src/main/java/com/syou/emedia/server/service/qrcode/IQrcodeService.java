package com.syou.emedia.server.service.qrcode;

import com.syou.emedia.server.model.qrcode.PFQrcode;
import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.ctrl.api.qrcode.QrcodeReq;

public interface IQrcodeService {

	/**
	 * 二维码校验
	 * @param req
	 * @return
	 * @throws Exception
	 */
	public Response checkQRCode(QrcodeReq req) throws Exception;

	/**
	 * 根据二维码ID查询二维码信息
	 * @param qrcodeId
	 * @return
	 * @throws Exception
	 */
	public PFQrcode queryQrcodeById(Integer qrcodeId) throws Exception;
	
	/**
	 * 更新二维码信息
	 * @param qrCode
	 * @throws Exception
	 */
	public void updateQrcode(PFQrcode qrCode) throws Exception;
	
	/**
	 * 获取礼品二维码
	 * @param mac
	 * @throws Exception
	 */
	public PFQrcode retrieveGiftQrcode(String mac) throws Exception;
	
	/**
	 * 生成测试二维码
	 * @throws Exception
	 */
	public void generateQrcode100() throws Exception;
}
