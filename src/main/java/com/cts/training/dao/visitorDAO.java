package com.cts.training.dao;



import java.util.List;

import com.cts.training.entity.People;


public interface visitorDAO {
	void updatePassword(int id,People p);
	void validateVisitor(People r);
	public void updateVisitor(int id,People p);
	List<People> getDetails();
	People getRegistration(int id);
}
