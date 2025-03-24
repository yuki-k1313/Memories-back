package com.jmg.memories_back.common.vo;

import java.util.ArrayList;
import java.util.List;

import com.jmg.memories_back.common.entity.ConcentrationTestEntity;

import lombok.Getter;

@Getter
public class ConcentrationTestVo {
	private Integer sequence;
	private Integer mesurementScore;
	private Integer errorCount;
	private String testDate;
	private Integer scoreGap;
	private Integer errorGap;

	private ConcentrationTestVo(ConcentrationTestEntity concentrationTestEntity) {
		this.sequence = concentrationTestEntity.getSequence();
		this.mesurementScore = concentrationTestEntity.getMeasurementScore();
		this.errorCount = concentrationTestEntity.getErrorCount();
		this.testDate = concentrationTestEntity.getTestDate();
		this.scoreGap = concentrationTestEntity.getScoreGap();
		this.errorGap = concentrationTestEntity.getErrorGap();
	}

	public static List<ConcentrationTestVo> getList(List<ConcentrationTestEntity> concentrationTestEntities) {

		List<ConcentrationTestVo> list = new ArrayList<>();

		for(ConcentrationTestEntity concentrationTestEntity: concentrationTestEntities) {
			ConcentrationTestVo vo =  new ConcentrationTestVo(concentrationTestEntity);
			list.add(vo);
		}

		return list;

	}
}
