package com.flower.dujiaohao.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.flower.dujiaohao.dao.ConsultDao;
import com.flower.dujiaohao.services.IConsultService;

@Service("consultService")
public class ConsultServiceImpl implements IConsultService{
	@Resource
	private ConsultDao dao;
	
	public String getUsername(Long consultId) {
		return dao.selectByPrimaryKey(consultId).getUsername();
	}

}
