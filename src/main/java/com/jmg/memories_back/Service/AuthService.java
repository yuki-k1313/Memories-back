package com.jmg.memories_back.Service;

import org.springframework.http.ResponseEntity;

import com.jmg.memories_back.common.dto.Response.ResponseDto;
import com.jmg.memories_back.common.dto.Response.auth.SignInResponseDto;
import com.jmg.memories_back.common.dto.request.auth.SignInRequestDto;
import com.jmg.memories_back.common.dto.request.auth.SignUpRequestDto;
import com.jmg.memories_back.common.dto.request.auth.idCheckRequestDto;

public interface AuthService {
    ResponseEntity<ResponseDto> idCheck(idCheckRequestDto dto);
    ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto);
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
}
