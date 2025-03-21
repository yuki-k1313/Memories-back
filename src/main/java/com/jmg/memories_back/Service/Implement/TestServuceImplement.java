package com.jmg.memories_back.service.Implement;

import com.jmg.memories_back.common.dto.request.test.PostMemoryRequestDto;
import com.jmg.memories_back.common.dto.response.ResponseDto;
import com.jmg.memories_back.service.TestService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TestServuceImplement implements TestService {

	@Override
	public ResponseEntity<ResponseDto> postMemory(PostMemoryRequestDto dto, String userId) {
		


		try {
			


		} catch (Exception exception) {
			exception.printStackTrace();
			return ResponseDto.databaseError();
		}

		return ResponseDto.success(HttpStatus.CREATED);

	}
	
}
