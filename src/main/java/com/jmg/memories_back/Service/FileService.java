package com.jmg.memories_back.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	String uplode(MultipartFile file);
	Resource getImageFile(String fileName);

}