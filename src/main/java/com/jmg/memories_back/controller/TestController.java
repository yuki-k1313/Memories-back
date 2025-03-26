package com.jmg.memories_back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmg.memories_back.common.dto.request.test.PostConcentrationRequestDto;
import com.jmg.memories_back.common.dto.request.test.PostMemoryRequestDto;
import com.jmg.memories_back.common.dto.response.ResponseDto;
import com.jmg.memories_back.common.dto.response.test.GetConcentrationResponseDto;
import com.jmg.memories_back.common.dto.response.test.GetMemoryResponseDto;
import com.jmg.memories_back.common.dto.response.test.GetRecentlyConcentrationResponseDto;
import com.jmg.memories_back.common.dto.response.test.GetRecentlyMemoryResponseDto;
import com.jmg.memories_back.service.TestService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {
  
  private final TestService testService;

  @PostMapping("/memory")
  public ResponseEntity<ResponseDto> postMemory(
    @RequestBody @Valid PostMemoryRequestDto requestBody,
    @AuthenticationPrincipal String userId
  ) {
    ResponseEntity<ResponseDto> response = testService.postMemory(requestBody, userId);
    return response;
  }

  @PostMapping("/concentration")
  public ResponseEntity<ResponseDto> postConcentration(
    @RequestBody @Valid PostConcentrationRequestDto requestBody,
    @AuthenticationPrincipal String userId
  ) {
    ResponseEntity<ResponseDto> response = testService.postConcentration(requestBody, userId);
    return response;
  }

  @GetMapping("/memory")
  public ResponseEntity<? super GetMemoryResponseDto> getMemory(
    @AuthenticationPrincipal String userId
  ) {
    ResponseEntity<? super GetMemoryResponseDto> response = testService.getMemory(userId);
    return response;
  }

  @GetMapping("/concentration")
  public ResponseEntity<? super GetConcentrationResponseDto> getConcentration(
    @AuthenticationPrincipal String userId
  ) {
    ResponseEntity<? super GetConcentrationResponseDto> response = testService.getConcentration(userId);
    return response;
  }

  @GetMapping("/memory/recently")
  public ResponseEntity<? super GetRecentlyMemoryResponseDto> getRecentlyMemory(
    @AuthenticationPrincipal String userId
  ) {
    ResponseEntity<? super GetRecentlyMemoryResponseDto> response = testService.getRecentlyMemory(userId);
    return response;
  }

  @GetMapping("/concentration/recently")
  public ResponseEntity<? super GetRecentlyConcentrationResponseDto> getRecentlyConcentration(
    @AuthenticationPrincipal String userId
  ) {
    ResponseEntity<? super GetRecentlyConcentrationResponseDto> response = testService.getRecentlyConcentration(userId);
    return response;
  }

}