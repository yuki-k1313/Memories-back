package com.jmg.memories_back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmg.memories_back.common.entity.MemoryTestEntity;
import com.jmg.memories_back.common.entity.pk.MemoryTestPk;

@Repository
public interface MemoryTestRepository extends JpaRepository<MemoryTestEntity, MemoryTestPk> {

	int countByUserId(String userid);

	MemoryTestEntity findByUserIdAndSequence(String userId, Integer sequence);
	List<MemoryTestEntity> findByUserIdOrderBySequenceDesc(String userId);
	List<MemoryTestEntity> findTop10ByUserIdOrderBySequenceDesc(String userId);

}