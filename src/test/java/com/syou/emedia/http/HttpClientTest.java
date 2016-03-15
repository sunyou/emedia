package com.syou.emedia.http;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.syou.emedia.server.utils.CryptoUtils;
import com.syou.emedia.server.utils.HttpClientUtils;
import com.syou.emedia.web.ctrl.api.pojo.ApInfo;
import com.syou.emedia.web.ctrl.api.pojo.CommodityInfo;
import com.syou.emedia.web.ctrl.api.pojo.QrCodeInfo;
import com.syou.emedia.web.ctrl.api.pojo.Request;
import com.syou.emedia.web.ctrl.api.pojo.TerminalInfo;
import com.syou.emedia.web.ctrl.api.qrcode.QrcodeReq;
import com.syou.emedia.web.ctrl.api.shipment.ShipmentReq;
import com.syou.emedia.web.ctrl.api.sync.SyncReq;
import com.syou.emedia.web.ctrl.api.wifi.WifiReq;

public class HttpClientTest {

	private static final String BASE_URL = "http://127.0.0.1:8080/emedia";
//	private static final String BASE_URL = "http://120.24.220.91:8080/emedia";
	private static final DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
//	@Test
//	public void testWifiConnectHttpPost(){
//		doPost(BASE_URL+"/home/wifi/connect.action","");
//	}
//	@Test
//	public void testQrcodeGenHttpPost(){
//		doPost(BASE_URL+"/api/qrcode/genQrcode.action","");
//	}
	
	@Test
	public void testQrcodeReqHttpPost() throws Exception {
		Request req = new Request();
		req.setAppId("301");
		req.setToken(CryptoUtils.aesEncrypt(df.format(new Date())+"00", CryptoUtils.MD5("system_vending"+"301")));
		req.setTranId("test");
		QrCodeInfo info = new QrCodeInfo();
		info.setQr_CODE_ID("9");
		QrcodeReq detail = new QrcodeReq();
		detail.setQr_CODE_INFO(info);
		req.setDetail(detail);
		
		System.out.println("请求明文："+JSON.toJSONString(req));
		String reqstr = CryptoUtils.encrypt3DESECB(JSON.toJSONString(req), CryptoUtils.MD5("system_smedia"+"101"));
		System.out.println("请求密文："+reqstr);
//		reqstr = "uzXBbDJVPjNZLJrHbC6Do41HOCu5USr5p4UOMaaQQ6AVTItCzmhFKqeFDjGmkEOgn1vTjoZaDpZXYM26+17780v0xvRmLzYUGf+pjLHqx77eelNEPipchpjVyiMk5M9X+jI6HQxeQgvkmkGPEejB4gu3JgSoNP3Ey2/DlWo9BQnZu2W6jjUUi+9mhnsIwWmpxmPrm0cLtLzye6+slEchdWdqCNbMAdqDDPZfzIv1QaWeHxX6GuUxOUEAVP8XHaQUtbg0qr3la8yivqHIziJYhp7j8s4oZtyfOk/3LvUkjLSUmPcNLbs3ntqwta52J6g5";
//		doPost(BASE_URL+"/api/qrcode/validate.action",reqstr);
	}
	
	@Test
	public void testWifiReqHttpPost() throws Exception {
		Request req = new Request();
		req.setAppId("301");
		req.setToken(CryptoUtils.aesEncrypt(df.format(new Date())+"00", CryptoUtils.MD5("system_vending"+"301")));
		req.setTranId("test");
		WifiReq detail = new WifiReq();
		detail.setIp("0.0.0.0");
		detail.setMac("34-80-b3-a3-9d-60");
		ApInfo ap_INFO = new ApInfo();
		ap_INFO.setAp_ID("22");
		ap_INFO.setAp_NAME("acName");
		ap_INFO.setAp_DESC("acDesc");
		detail.setAp_INFO(ap_INFO);
		req.setDetail(detail);
		System.out.println("请求明文："+JSON.toJSONString(req));
		String reqstr = CryptoUtils.encrypt3DESECB(JSON.toJSONString(req), CryptoUtils.MD5("system_smedia"+"101"));
		System.out.println("请求密文："+reqstr);
//		Map<String,Object> result = new HashMap<String,Object>();
//		HttpClientUtils.doGet(BASE_URL+"/api/wifi/report.action?msg="+reqstr, result);
//		System.out.println(result.get("statusCode"));
//		System.out.println(result.get("rspBody"));
	}
	
	@Test
	public void testSyncReqHttpPost() throws Exception {
		Request req = new Request();
		SyncReq detail = new SyncReq();
		req.setAppId("301");
		req.setToken(CryptoUtils.aesEncrypt(df.format(new Date())+"00", CryptoUtils.MD5("system_vending"+"301")));
		req.setTranId("test");
		detail.setChannel_ID("测试渠道（厂家）");
		detail.setMac("11:22:33:44");
		detail.setFirst_DATE(df.format(new Date()));
		req.setDetail(detail);
		System.out.println("请求明文："+JSON.toJSONString(req));
		String reqstr = CryptoUtils.encrypt3DESECB(JSON.toJSONString(req), CryptoUtils.MD5("system_smedia"+"101"));
		System.out.println("请求密文："+reqstr);
//		doPost(BASE_URL+"/api/sync/loginfo.action", reqstr);
	}
	
	@Test
	public void testShipmentReqHttpPost() throws Exception {
		Request req = new Request();
		req.setAppId("301");
		req.setToken(CryptoUtils.aesEncrypt(df.format(new Date())+"00", CryptoUtils.MD5("system_vending"+"301")));
		req.setTranId("test");
		ShipmentReq detail = new ShipmentReq();
		detail.setQr_CODE_ID("1");
		List<CommodityInfo> commodity_INFO_LIST = new ArrayList<CommodityInfo>();
		CommodityInfo c1 = new CommodityInfo();
		c1.setCommodity_ID("1");
		c1.setShipment_RESULT("0");//
		c1.setShipment_RESULT_DESC("出货成功");
		commodity_INFO_LIST.add(c1);
		CommodityInfo c2 = new CommodityInfo();
		c2.setCommodity_ID("2");
		c2.setShipment_RESULT("99");//
		c2.setShipment_RESULT_DESC("出货失败");
		commodity_INFO_LIST.add(c2);
		detail.setCommodity_INFO_LIST(commodity_INFO_LIST);
		TerminalInfo ter = new TerminalInfo();
		ter.setTer_ID("88");
		detail.setTer_INFO(ter);
		req.setDetail(detail);
		System.out.println("请求明文："+JSON.toJSONString(req));
		String reqstr = CryptoUtils.encrypt3DESECB(JSON.toJSONString(req), CryptoUtils.MD5("system_smedia"+"101"));
		System.out.println("请求密文："+reqstr);
		reqstr="uzXBbDJVPjNZLJrHbC6Do41HOCu5USr5xvdJiv6umSL833yHZwEajniIstDFaq0xxvdJiv6umSKeSeh5xzHdhh3uOKviD3yYSsyIx5Bd8k0tRLoacGNgaf1o0Nj80kNnjLl0g/RYKjxXa5eluY6jx62OjhoLcz5EsIuqLyN32l3zzPrB1HPkMnXHAMSqmTvT5zFVXBd1tjwzNF3EnoPK2aEeDqfuJbG2+Xo8s0MiZ43V5T1SaDfaTdWimjVXn+ZS6eLvI9KPxoXH2ytZWiEZf+WXNIiwwOpufEcphmxXIHzjpWyyZFLij1YxMQto1oTU7UEttdDpJPcF0DeJ2383ISzpJPdQKJaQZpbBmrwLi4xfkuNADcFARj2iI7OesWTcV7TPPmVXVUR7I/0UFnaRgUv0xvRmLzYUGf+pjLHqx77eelNEPipchpjVyiMk5M9X+jI6HQxeQgvkmkGPEejB4gu3JgSoNP3Ey2/DlWo9BQnZu2W6jjUUi+9mhnsIwWmpKtkGMqWEO+Tye6+slEchda2eScGCRKIoOmFnbnm13de81DLiHmbuzdVkDPAMEBLxNi1fqTEsM82ivqHIziJYhogsKFPF2ZiVa8sg+WnpfoCYZISSaeC+/GMWWmcmHyTP";
//		doPost(BASE_URL+"/api/shipment/result.action", reqstr);
	}
	
	@Test
	public void testWifiConnectPost() throws Exception {
//		doPost(BASE_URL+"/home/wifi/connect.action", "{\"mac\":\"11:22:33:44:55\"}");
		try {
			JSONObject req = new JSONObject();
			req.put("apikey", "sunnada");
			req.put("stamac", "34-80-b3-a3-9d-60");
//			Map<String,Object> result = new HashMap<String,Object>();
//			HttpClientUtils.doPost("http://218.5.9.225:8088/AC/index.php/ExternInterface/usrauthapi", req.toJSONString(),result);
//			System.out.println("----------------->"+result.get("rspBody"));
			//doPost("http://218.5.9.225:8088/AC/index.php/ExternInterface/usrauthapi", req.toJSONString());
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}
	  /**
	   * post请求
	   * @param url
	   * @param json
	   * @return
	   */
	  
	  public static void doPost(String url,String json){
	    HttpClient client = new DefaultHttpClient();
	    HttpPost post = new HttpPost(url);
	    try {
	      StringEntity s = new StringEntity(json.toString());
	      s.setContentEncoding("UTF-8");
	      s.setContentType("application/json");//发送json数据需要设置contentType
	      post.setEntity(s);
	      HttpResponse res = client.execute(post);
	      if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
	        HttpEntity entity = res.getEntity();
	        String result = EntityUtils.toString(entity);// 返回json格式：
	        System.out.println("返回明文--------->"+CryptoUtils.decrypt3DESECB(result, CryptoUtils.MD5("system_smedia"+"101")));
	      }
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }
	  }
}
