package com.min.project.service;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository

public class userServiceImpl implements userService {

	
	@Inject
	private SqlSession sql;
	
	
	@Override
	public String getList() {
		// TODO Auto-generated method stub
		return sql.selectOne("user.selectUser");
	}
	
	@Override
	public String searchUserList(String userId) {
	    return sql.selectOne("user.searchUserList", userId);
	}

}
