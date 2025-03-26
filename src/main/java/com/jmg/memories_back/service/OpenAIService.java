package com.jmg.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.jmg.memories_back.common.dto.request.openai.GetWayRequestDto;
import com.jmg.memories_back.common.dto.response.openai.GetWayResponseDto;

public interface OpenAIService {
	ResponseEntity<? super GetWayResponseDto> getWay(GetWayRequestDto dto, String userId);
}
