package com.cts.training.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.training.entity.Event;
@Repository
public class EventDao {
	@Autowired
	private SessionFactory sf;
	public void regisevent(Event e)
	{
		System.out.println("event dao");
		Session session=sf.openSession();
		session.saveOrUpdate(e);
	}
	public void updateEvent(Event e,int eid,int k)
	{
		Session session=sf.openSession();
		Query q=session.createQuery("Update Event set availableseats=:k where id=:eid ");
		q.setParameter("eid", eid);
		q.setInteger("k", k);
		q.executeUpdate();
		
	}
	public Event regis(int id)
	{		Session session = sf.openSession();
Event e=(Event)session.get(Event.class, id);

		return e;
	}
public List<Event> getEvents()
{
	Session session=sf.openSession();
	Query q=session.createQuery("from Event");
	List<Event> e=q.list();
	return e;
	}
}
