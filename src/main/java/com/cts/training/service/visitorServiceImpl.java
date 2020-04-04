package com.cts.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.dao.visitorDAO;
import com.cts.training.entity.People;

@Service
public class visitorServiceImpl implements visitorService {
	@Autowired
	private visitorDAO dao;
	


    @Override
	@Transactional
	public void CreateVisitor(People r) {
		dao.validateVisitor(r);
		
	}




	@Override
	@Transactional
	public List<People> getDetails() {
		
		return dao.getDetails();
		
	}




	@Override
	@Transactional
	public People getRegistration(int id) {
		
		return dao.getRegistration(id);
	}




	@Override
	@Transactional
	public void UpdatePassword(int id,People p) {
		
		 dao.updatePassword(id,p);
	}




	@Override
	@Transactional
	public void updateVisitor(int id,People p) {
		
		dao.updateVisitor(id,p);
		// TODO Auto-generated method stub
		
	}















}
