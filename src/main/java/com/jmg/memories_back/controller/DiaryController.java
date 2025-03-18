package com.jmg.memories_back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmg.memories_back.Service.DiaryService;
import com.jmg.memories_back.common.dto.request.diary.PostDiaryRequestDto;
import com.jmg.memories_back.common.dto.response.ResponseDto;
import com.jmg.memories_back.common.dto.response.diary.GetDiaryResponseDto;
import com.jmg.memories_back.common.dto.response.diary.GetMyDiaryResponseDto;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/diary")
@RequiredArgsConstructor
public class DiaryController {
    
    private final DiaryService diarySerivce;

    @PostMapping({"", "/"})
    public ResponseEntity<ResponseDto> postDiary(
        @RequestBody @Valid PostDiaryRequestDto requestBody,
        @AuthenticationPrincipal String userId
    ) {
        ResponseEntity<ResponseDto> response = diarySerivce.postDiary(requestBody, userId);
        return response;
    }

    @GetMapping("/my")
    public ResponseEntity<? super GetMyDiaryResponseDto> getMyDiary(
        @AuthenticationPrincipal String userId
    ) {
        ResponseEntity<? super GetMyDiaryResponseDto> response = diarySerivce.getMyDiary(userId);
        return response;
    }

    @GetMapping("/{diaryNumber}")
    public ResponseEntity<? super GetDiaryResponseDto> getDiary(
        @PathVariable("diaryNumber") Integer diaryNumber
    ) {
        ResponseEntity<? super GetDiaryResponseDto> response = diarySerivce.getDiary(diaryNumber);
        return response;
    }

}
