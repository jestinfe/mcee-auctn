package com.mcee.auctn.com.mbrJoin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mcee.auctn.com.mbrJoin.mapper.MbrJoinMapper;
import com.mcee.auctn.com.mbrJoin.service.MbrJoinService;
import com.mcee.auctn.com.mbrJoin.vo.MbrJoinReqVO;

@Service
public class MbrJoinServiceImpl implements MbrJoinService {
	
	private MbrJoinMapper mbrJoinMapper;
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	public MbrJoinServiceImpl(MbrJoinMapper mbrJoinMapper,
		@Qualifier("passwordEncoder") PasswordEncoder passwordEncoder) {
		this.mbrJoinMapper = mbrJoinMapper;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Override
	@Transactional
	public void join(MbrJoinReqVO mbrJoinReqVO) {
		if (mbrJoinMapper.countById(mbrJoinReqVO) > 0) {
			throw new IllegalArgumentException("사용할 수 없는 아이디입니다.");
		}
		
		String encodedPswd = passwordEncoder.encode(mbrJoinReqVO.getPswd());
		mbrJoinReqVO.setPswd(encodedPswd);
		
		mbrJoinMapper.insertMbr(mbrJoinReqVO);
	}
}
