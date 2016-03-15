package com.syou.emedia.server.service.shipment;

import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.ctrl.api.shipment.ShipmentReq;

public interface IShipmentService {

	/**
	 * 保存出货结果
	 * @param req
	 * @return
	 * @throws Exception
	 */
	public Response saveShipmentResult(ShipmentReq req) throws Exception;
}
