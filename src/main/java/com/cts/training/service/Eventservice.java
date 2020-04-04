package com.cts.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.dao.EventDao;
import com.cts.training.entity.Event;

@Service
public class Eventservice {
	@Autowired
	private EventDao dao;
	@Transactional
	public void createEvent(Event e)
	{
		dao.regisevent(e);
	}
	@Transactional
	public Event regis(int id)
	{
		return dao.regis(id);
	}
	@Transactional
	public List<Event> getEvents() {
	return dao.getEvents();
	}
	@Transactional
	public void updateEvent(Event e,int eid,int k)
	{
	dao.updateEvent(e, eid, k);
	}


}
