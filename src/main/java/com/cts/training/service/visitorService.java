package com.cts.training.service;

import java.util.List;

import com.cts.training.entity.People;

public interface visitorService {
	People getRegistration(int id);
	void CreateVisitor(People r);
	public void updateVisitor(int id,People p);
	void UpdatePassword(int id,People p);
	List<People> getDetails();
	//boolean checkCredentials(String username,String password);
}
