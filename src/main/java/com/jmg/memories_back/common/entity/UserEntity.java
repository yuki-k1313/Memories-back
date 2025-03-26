package com.jmg.memories_back.common.entity;

import com.jmg.memories_back.common.dto.request.auth.SignUpRequestDto;
import com.jmg.memories_back.common.dto.request.user.PatchUserRequestDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="user")
@Table(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
  
  @Id
  private String userId;
  private String userPassword;
  private String joinType;
  private String snsId;
  private String name;
  private String address;
  private String detailAddress;
  private String profileImage;
  private String gender;
  private Integer age;

  public UserEntity(SignUpRequestDto dto) {
    this.userId = dto.getUserId();
    this.userPassword = dto.getUserPassword();
    this.name = dto.getName();
    this.address = dto.getAddress();
    this.detailAddress = dto.getDetailAddress();
    this.joinType = dto.getJoinType();
    this.snsId = dto.getSnsId();
  }

  public void patch(PatchUserRequestDto dto) {
    this.name = dto.getName();
    this.profileImage = dto.getProfileImage();
    this.address = dto.getAddress();
    this.detailAddress = dto.getDetailAddress();
    this.gender = dto.getGender();
    this.age = dto.getAge();
  }

}