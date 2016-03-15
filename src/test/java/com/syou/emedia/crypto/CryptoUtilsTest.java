package com.syou.emedia.crypto;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.syou.emedia.server.model.qrcode.PFQrcode;
import com.syou.emedia.server.model.terminal.PFTerminal;
import com.syou.emedia.server.utils.CryptoUtils;
import com.syou.emedia.web.ctrl.api.qrcode.QrcodeReq;

import junit.framework.Assert;

public class CryptoUtilsTest {

	@Test
	public void testSecretKey() throws Exception{
		String plainText = "system_wifi"+"201";
		System.out.println(CryptoUtils.MD5(plainText));
	}
	
	@Test
	public void testAesCrypto() throws Exception{
		String token = "2016021923502300";
		String appSecret = "8D9F29BA52FF9912008816AD595AA89E";
		String encryptStr = CryptoUtils.aesEncrypt(token, appSecret);
//		Assert.assertEquals("9D9B72116DA0BEB9261368971620AC25", encryptStr);
		System.out.println("加密后："+encryptStr);
		System.out.println("解密后："+CryptoUtils.aesDecrypt(encryptStr, appSecret));
	}
	
	@Test
	public void testBase64() throws Exception{
		String appSecret = "sunyou";
		System.out.println(CryptoUtils.base64Encode(appSecret.getBytes()));
	}
	
	@Test
	public void test3DES() throws Exception{
//		Assert.assertEquals("8D9F29BA52FF9912008816AD595AA89E", CryptoUtils.MD5("system_smedia"+"101"));
		String encrypt = "xvdJiv6umSL833yHZwEajhmHb4waPCDzkpIyEUc7vyVPVrpdcdp41urSk2YmYgh2xgwqEIL+Ie7x3rd2/CGNeVSxtWf8/w7RqT9kxjvCmUoZ/6mMserHvsYMKhCC/iHu8d63dvwhjXm4oaPhfNlu6chpUya9iiO37XF3gRNi7ANcXSlHZwol4pR0ESH1vf+iGJfqdnm64dKQXlORq2oufg==";
//		String encrypt = CryptoUtils.encrypt3DESECB("sunyou", CryptoUtils.MD5("system_smedia"+"101"));
		encrypt = "O+1unwjidHaNybtijibX2sH3xaBZP1xcObHJ/NGJzThpop9HSzAknbN39afPrBe8hhS6qutZbHlKDmublJ2R6A==";
		encrypt = "IBDSzlxYR3Or/EOA2PmDMqdPQSXgh8jdINe9puUJP96Z/Kib69TrtM0slvYRUtdr7vZL1HOAVsjTKghz66HAm1KxZdcle8rEiqB79/s68pnKM7/kysysZQ==";
		encrypt="uzXBbDJVPjPgOK2wkSrIungtRc6SQ27CNMtDrcnVZbFYboGLfeVmUlwTuzZ50AYbSAIZiHTnk9QO5b3dA2Pg1Bl1iVHYF493LfXf7Cu7DV+1lVUXzE4C09BgThdMiULfmoPpHx2g4NVZW65fEQr22BDikGkpjJ6u9zuUtFLZRJ/Ua7+rdo87V196Rly+JcLqSuU1uHpCHDBzACBm9uyPHFrXpmzehtWUsvy8/UKAo9Pbh4PB/agJ5cXxhkEBNmPFtdv2OFXbH9mTrWxiVhD124TuFirE78tf4xPyUVM1Nxu6GgwaWVOdAeAfi6F+G8EPy+1dftecjIb4muGwliN+Dci4+8evdYzJ";
		System.out.println(CryptoUtils.decrypt3DESECB(encrypt, CryptoUtils.MD5("system_smedia"+"101")));
		
	}
	
	@Test
	public void testSystermInfo(){
		System.out.println("能力开放平台：（1）系统code为101；（2）系统密钥为："+CryptoUtils.MD5("system_smedia"+"101"));
		System.out.println("WIFI：（1）系统code为201；（2）系统密钥为："+CryptoUtils.MD5("system_wifi"+"201"));
		System.out.println("售卖机：（1）系统code为301；（2）系统密钥为："+CryptoUtils.MD5("system_vending"+"301"));
		System.out.println("app推广方：（1）系统code为1001；（2）系统密钥为："+CryptoUtils.MD5("system_app"+"1001"));
		System.out.println("测试系统帐号：（1）系统code为2016；（2）系统密钥为："+CryptoUtils.MD5("system_test"+"2016"));
	}
}
