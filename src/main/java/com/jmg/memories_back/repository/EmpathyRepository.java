package com.jmg.memories_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmg.memories_back.common.entity.EmpathyEntity;
import com.jmg.memories_back.common.entity.pk.EmpathyPk;

@Repository
public interface EmpathyRepository extends JpaRepository<EmpathyEntity, EmpathyPk> {
  
}