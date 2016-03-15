package com.syou.emedia.web.ctrl.comm;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
@Scope(value="prototype")
public class FileUploadController {
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public void upload(HttpServletRequest request,HttpServletResponse response,@RequestParam(value="file", required=false) MultipartFile file){
		try {
			byte[] bytes = file.getBytes();  
	        String uploadDir = request.getSession().getServletContext().getRealPath("/");
	        File dirPath = new File(uploadDir);  
	        if (!dirPath.exists()) {  
	            dirPath.mkdirs();  
	        }  
	        File uploadedFile = new File(uploadDir + File.separator  + file.getOriginalFilename());  
	        FileCopyUtils.copy(bytes, uploadedFile);  
	        response.getWriter().write("");  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
