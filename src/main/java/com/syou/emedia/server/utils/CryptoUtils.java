package com.syou.emedia.server.utils;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/** 
 * 编码工具类 
 * 1.将byte[]转为各种进制的字符串 
 * 2.base 64 encode 
 * 3.base 64 decode 
 * 4.获取byte[]的md5值 
 * 5.获取字符串md5值 
 * 6.结合base64实现md5加密 
 * 7.AES加密 
 * 8.AES加密为base 64 code 
 * 9.AES解密 
 * 10.将base 64 code AES解密 
 */ 
public class CryptoUtils {

	/** 
     * 将byte[]转为各种进制的字符串 
     * @param bytes byte[] 
     * @param radix 可以转换进制的范围，从Character.MIN_RADIX到Character.MAX_RADIX，超出范围后变为10进制 
     * @return 转换后的字符串 
     */  
    public static String binary(byte[] bytes, int radix){  
        return new BigInteger(1, bytes).toString(radix);// 这里的1代表正数  
    }  
    
    /** 
     * base 64 encode 
     * @param bytes 待编码的byte[] 
     * @return 编码后的base 64 code 
     */  
	public static String base64Encode(byte[] bytes){  
        return new BASE64Encoder().encode(bytes);  
    }  
      
    /** 
     * base 64 decode 
     * @param base64Code 待解码的base 64 code 
     * @return 解码后的byte[] 
     * @throws Exception 
     */  
	public static byte[] base64Decode(String base64Code) throws Exception{  
        return StringUtils.isEmpty(base64Code) ? null : new BASE64Decoder().decodeBuffer(base64Code);  
    }  
      
    public final static String MD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};       
        try {
            byte[] btInput = s.getBytes("utf-8");
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**      
     * 标准MD5加密      
     *        
     * @param inStr      
     * @return      
     * @throws Exception      
     */    
    public static String toMD5(String inStr) {         
    	StringBuffer sb = new StringBuffer();         
    	try {             
    		MessageDigest md = MessageDigest.getInstance("MD5");             
    		md.update(inStr.getBytes());             
    		byte b[] = md.digest();             
    		int i;             
    		for (int offset = 0; offset < b.length; offset++) {                 
    			i = b[offset];                 
    			if (i < 0)                     
    				i += 256;                 
    			if (i < 16)                     
    				sb.append("0");                 
    			sb.append(Integer.toHexString(i));             
    		}         
    	} catch (Exception e) {             
    		return null;             //          e.printStackTrace();         
    	}         
    	return sb.toString().toUpperCase();
    }
    
    /**
	 * AES加密为base 64 code
	 * @param content 待加密的内容
	 * @param encryptKey 加密密钥
	 * @return 加密后的base 64 code
	 * @throws Exception
	 */
	public static String aesEncrypt(String content, String encryptKey) throws Exception {
	 	byte[] enCodeFormat = parseHexStr2Byte(encryptKey);        
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");// 创建密码器 
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(enCodeFormat, "AES"));
		byte[] datas=cipher.doFinal(content.getBytes("utf-8"));
		return byte2hex(datas);
	}
	
	/**
	 * 将base 64 code AES解密
	 * @param encryptStr 待解密的base 64 code
	 * @param decryptKey 解密密钥
	 * @return 解密后的string
	 * @throws Exception
	 */
	public static String aesDecrypt(String encryptStr, String decryptKey) throws Exception {
		byte[] encryptBytes=parseHexStr2Byte(encryptStr);
		byte[] deCodeFormat = parseHexStr2Byte(decryptKey); 
		Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
		cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(deCodeFormat, "AES"));
		byte[] decryptBytes = cipher.doFinal(encryptBytes);
 	    return new String(decryptBytes);
	}
	
	   public static String byte2hex(byte[] b) { 
	        String hs = ""; 
	        String stmp = ""; 
	        for (int n = 0; n < b.length; n++) { 
	            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF)); 
	            if (stmp.length() == 1) { 
	                hs = hs + "0" + stmp; 
	            } else { 
	                hs = hs + stmp; 
	            } 
	        } 
	        return hs.toUpperCase(); 
	    } 
	   
	public static byte[] parseHexStr2Byte(String hexStr) { 
            if (hexStr.length() < 1) 
                    return null; 
            byte[] result = new byte[hexStr.length()/2]; 
            for (int i = 0;i< hexStr.length()/2; i++) { 
                    int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16); 
                    int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16); 
                    result[i] = (byte) (high * 16 + low); 
            } 
            return result; 
    } 
	
    public static byte[] decrypt(byte[] content, String password) {
		try {
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
			kgen.init(128, new SecureRandom(password.getBytes()));
			SecretKey secretKey = kgen.generateKey();
			byte[] enCodeFormat = secretKey.getEncoded();
			SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
			Cipher cipher = Cipher.getInstance("AES");// 创建密码器
			cipher.init(Cipher.DECRYPT_MODE, key);// 初始化 (解密)
			byte[] result = cipher.doFinal(content);
			return result; // 加密
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return null;
	}
    
    /**
     *	3DES 解密和加密算法
     * @version $Revision: 1.2 $
     * @see	http://blog.csdn.net/justinjing0612/article/details/8482689
     */
    //公钥
  	public final static String PUBLIC_KEY = "SYSTEM_SMEDIA";
  	//加密类型
  	private final static String ENCRYP_TYPE = "DESede";
  	//填充模式
  	private final static String ENCRYP_MODE = "DESede/ECB/PKCS5Padding";
  	//统一编码
  	public final static String ENCODING = "UTF-8";
  	
  	/**
  	 * 3DESECB加密
  	 * @param src	明文
  	 * @param key	key必须是长度大于等于 3*8 = 24 位  
  	 * @return
  	 * @throws Exception
  	 */
  	public static String encrypt3DESECB(String src,String key) throws Exception{  
          DESedeKeySpec dks = new DESedeKeySpec(key.getBytes(ENCODING));  
          SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ENCRYP_TYPE);  
          SecretKey securekey = keyFactory.generateSecret(dks);  
            
          Cipher cipher = Cipher.getInstance(ENCRYP_MODE);  
          cipher.init(Cipher.ENCRYPT_MODE, securekey);  
          byte[] b=cipher.doFinal(src.getBytes(ENCODING));  
          return new String(Base64.encodeBase64(b),ENCODING);  
            
      }  
  	
  	/**
  	 * 3DESECB解密
  	 * @param src 密文
  	 * @param key key必须是长度大于等于 3*8 = 24 位  
  	 * @return
  	 * @throws Exception
  	 */
      public static String decrypt3DESECB(String src,String key) throws Exception {  
          //--通过base64,将字符串转成byte数组  
          byte[] bytesrc = Base64.decodeBase64(src);  
          //--解密的key  
          DESedeKeySpec dks = new DESedeKeySpec(key.getBytes(ENCODING));  
          SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ENCRYP_TYPE);  
          SecretKey securekey = keyFactory.generateSecret(dks);  
            
          //--Chipher对象解密  
          Cipher cipher = Cipher.getInstance(ENCRYP_MODE);  
          cipher.init(Cipher.DECRYPT_MODE, securekey);  
          byte[] retByte = cipher.doFinal(bytesrc);  
            
          return new String(retByte, ENCODING);  
      }
      
      /**
       * 3DESECB加密，使用公钥
       * @param src
       * @return
       * @throws Exception
       */
      public static String encryptByPublicKey(String src) throws Exception{
      	return encrypt3DESECB(src, PUBLIC_KEY);
      }
      
      /**
  	 * 3DESECB解密，使用公钥
  	 * @param src 密文
  	 * @return
  	 * @throws Exception
  	 */
      public static String decryptByPublicKey(String src) throws Exception{
      	return decrypt3DESECB(src, PUBLIC_KEY);
      }
      
  	public static void main(String[] args) throws Exception {
  			long startTime=System.currentTimeMillis();  
  			String encrypt = encrypt3DESECB("20150211151223", "36A80BBB62F8C7B377080175E9D07181");
  			long endTime=System.currentTimeMillis();
  			System.out.println("加密秘钥程序运行时间： "+(endTime-startTime)+"ms"); 
  			System.out.println("加密后的秘钥：" + encrypt);
  			
//  			long startTime1=System.currentTimeMillis();  
//  			String encryptTime = aesEncrypt("20150204175764", "40C4C2C54E9B77EAB81E12E300A977DB");
//  			long endTime1=System.currentTimeMillis();
//  			System.out.println("加密时间戳程序运行时间： "+(endTime1-startTime1)+"ms"); 
//  			System.out.println("加密后的时间戳：" + encryptTime);
//  			
//  			long startTime2=System.currentTimeMillis(); 
//  			String decryptTime = aesDecrypt(encryptTime, "40C4C2C54E9B77EAB81E12E300A977DB");
//  			long endTime2=System.currentTimeMillis();
//  			System.out.println("解密时间戳程序运行时间： "+(endTime2-startTime2)+"ms"); 
//  			System.out.println("解密后时间戳：" + decryptTime);
//  			
  			long startTime3=System.currentTimeMillis(); 
  			String decrypt = decrypt3DESECB(encrypt, "36A80BBB62F8C7B377080175E9D07181");
  			long endTime3=System.currentTimeMillis();
  			System.out.println("解密时间戳程序运行时间： "+(endTime3-startTime3)+"ms"); 
  			System.out.println("解密后秘钥：" + decrypt);
  	}
}
