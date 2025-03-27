package com.jmg.memories_back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmg.memories_back.common.entity.CommentEntity;

import jakarta.transaction.Transactional;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {

	List<CommentEntity> findByDiaryNumberOrderByWriteDateDesc(Integer diaryNumber);

	@Transactional
	void deleteBydiaryNumber(Integer diaryNumber);
  
}