package com.syou.emedia.web.interceptors;

import java.util.Map;
import java.util.concurrent.Callable;

import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.async.CallableProcessingInterceptorAdapter;

public class TimeoutCallableProcessingInterceptor extends CallableProcessingInterceptorAdapter {

	@Override
	public <T> Object handleTimeout(NativeWebRequest request, Callable<T> task) throws Exception {
		throw new IllegalStateException("[" + task.getClass().getName() + "] timed out");
	}
	
	@Override
	public <T> void preProcess(NativeWebRequest request, Callable<T> task) throws Exception {
		super.preProcess(request, task);
		Map<String,String[]> map = request.getParameterMap();
		for (Map.Entry<String, String[]> entry : map.entrySet()) {
			System.out.println("key:"+entry.getKey()+"=>value:"+entry.getKey());
		}
	}

}
