package com.jmg.memories_back.common.dto.response.diary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.jmg.memories_back.common.dto.response.ResponseDto;
import com.jmg.memories_back.common.entity.EmpathyEntity;

import lombok.Getter;

@Getter
public class GetEmpathyResponseDto extends ResponseDto {

	private List<String> empathies;

	private GetEmpathyResponseDto(List<EmpathyEntity> empathyEntities)  {
		this.empathies = new ArrayList<>();
		for (EmpathyEntity empathyEntity: empathyEntities) {
			String userId = empathyEntity.getUserId();
			this.empathies.add(userId);
		}
	}

	public static ResponseEntity<GetEmpathyResponseDto> success(List<EmpathyEntity> empathyEntities) {
		GetEmpathyResponseDto body = new GetEmpathyResponseDto(empathyEntities);
		return ResponseEntity.status(HttpStatus.OK).body(body);
	}
	
}
