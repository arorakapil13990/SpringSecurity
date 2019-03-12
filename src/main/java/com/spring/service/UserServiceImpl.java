package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInterface{
	
	public Integer findNumberOfUser(){
		return 10;
	}

}
