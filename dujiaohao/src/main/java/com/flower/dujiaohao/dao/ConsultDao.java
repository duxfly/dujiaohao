package com.flower.dujiaohao.dao;

import com.flower.dujiaohao.pojo.Consult;

public interface ConsultDao {
    int deleteByPrimaryKey(Long consultid);

    int insert(Consult record);

    int insertSelective(Consult record);

    Consult selectByPrimaryKey(Long consultid);

    int updateByPrimaryKeySelective(Consult record);

    int updateByPrimaryKey(Consult record);
}