package com.mcee.auctn.com.mbrJoin.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mcee.auctn.com.mbrJoin.vo.MbrJoinReqVO;

@Mapper
public interface MbrJoinMapper {
	
	int countById(MbrJoinReqVO mbrReqVO);
	
	int insertMbr(MbrJoinReqVO mbrReqVO);
}
