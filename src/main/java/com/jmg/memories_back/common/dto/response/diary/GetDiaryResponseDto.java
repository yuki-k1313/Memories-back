package com.jmg.memories_back.common.dto.response.diary;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.jmg.memories_back.common.dto.response.ResponseDto;
import com.jmg.memories_back.common.entity.DiaryEntity;

import lombok.Getter;

@Getter
public class GetDiaryResponseDto extends ResponseDto {
    private String writeDate;
    private String weather;
    private String feeling;
    private String title;
    private String content;
    private String writerId;

    private GetDiaryResponseDto(DiaryEntity diaryEntity) {
        this.writeDate = diaryEntity.getWriteDate();
        this.weather = diaryEntity.getWeather();
        this.feeling = diaryEntity.getFeeling();
        this.title = diaryEntity.getTitle();
        this.content = diaryEntity.getContent();
        this.writerId = diaryEntity.getUserId();
    }

    public static ResponseEntity<GetDiaryResponseDto> success(DiaryEntity diaryEntity) {
        GetDiaryResponseDto body = new GetDiaryResponseDto(diaryEntity);
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

}
