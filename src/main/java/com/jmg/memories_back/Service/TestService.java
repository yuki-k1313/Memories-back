package com.jmg.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.jmg.memories_back.common.dto.request.test.PostMemoryRequestDto;
import com.jmg.memories_back.common.dto.response.ResponseDto;

public interface TestService {
	ResponseEntity<ResponseDto> postMemory(PostMemoryRequestDto dto, String userId);
}
