package com.syou.emedia.server.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpClientUtils {

	/**
     * 通过GET方式发起http请求
     */
    public static void doGet(String url,Map<String,Object> result){
        //创建默认的httpClient实例
        CloseableHttpClient httpClient = getHttpClient();
        try {
            HttpGet get = new HttpGet(url);
            CloseableHttpResponse httpResponse = null;
            httpResponse = httpClient.execute(get);
            try{
            	 result.put("statusCode", httpResponse.getStatusLine().getStatusCode());
            	 if(httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                 	HttpEntity entity = httpResponse.getEntity();
                 	result.put("rspBody", EntityUtils.toString(entity));
                 }
            } finally{
                httpResponse.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                closeHttpClient(httpClient);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
     
     
    /**
     * POST方式发起http请求
     */
    public static void doPost(String url,Map<String,String> params,Map<String,Object> result){
        CloseableHttpClient httpClient = getHttpClient();
        try {
            HttpPost post = new HttpPost(url);
            //创建参数列表
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            for (Map.Entry<String,String> entry : params.entrySet()) {
            	list.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
            //url格式编码
            UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(list,"UTF-8");
            post.setEntity(uefEntity);
            //执行请求
            CloseableHttpResponse httpResponse = httpClient.execute(post);
            try{
            	result.put("statusCode", httpResponse.getStatusLine().getStatusCode());
                if(httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                	HttpEntity entity = httpResponse.getEntity();
                	result.put("rspBody", EntityUtils.toString(entity));
                }
            } finally{
                httpResponse.close();
            }
        } catch( UnsupportedEncodingException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                closeHttpClient(httpClient);                
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public static void doPost(String url,String json,Map<String,Object> result) throws Exception{
        CloseableHttpClient httpClient = getHttpClient();
        try {
            HttpPost post = new HttpPost(url);
            StringEntity s = new StringEntity(json.toString());
  	      	s.setContentEncoding("UTF-8");
  	      	s.setContentType("application/json");//发送json数据需要设置contentType
  	      	post.setEntity(s);
            //执行请求
            CloseableHttpResponse httpResponse = httpClient.execute(post);
            try{
            	result.put("statusCode", httpResponse.getStatusLine().getStatusCode());
                if(httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                	HttpEntity entity = httpResponse.getEntity();
                	result.put("rspBody", EntityUtils.toString(entity));
                }
            } finally{
                httpResponse.close();
            }
        } catch( UnsupportedEncodingException e){
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally{
            try{
                closeHttpClient(httpClient);                
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public static void doPost(String url,StringEntity s,Map<String,Object> result) throws Exception{
        CloseableHttpClient httpClient = getHttpClient();
        try {
            HttpPost post = new HttpPost(url);
  	      	post.setEntity(s);
            //执行请求
            CloseableHttpResponse httpResponse = httpClient.execute(post);
            try{
            	result.put("statusCode", httpResponse.getStatusLine().getStatusCode());
                if(httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                	HttpEntity entity = httpResponse.getEntity();
                	result.put("rspBody", EntityUtils.toString(entity));
                }
            } finally{
                httpResponse.close();
            }
        } catch( UnsupportedEncodingException e){
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally{
            try{
                closeHttpClient(httpClient);                
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    private static CloseableHttpClient getHttpClient(){
        return HttpClients.createDefault();
    }
     
    private static void closeHttpClient(CloseableHttpClient client) throws IOException{
        if (client != null){
            client.close();
        }
    }
}
