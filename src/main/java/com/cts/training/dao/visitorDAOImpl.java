package com.cts.training.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.training.entity.People;
import com.cts.training.entity.Registration;

@Repository
public class visitorDAOImpl implements visitorDAO {
	@Autowired
	private SessionFactory sf;

//	@Override
//	public void saveRegis(Registration r) {
//		System.out.println("DAO IMPL...");
//		Session session=sf.openSession();
//		session.saveOrUpdate(r);
//		System.out.println(r.getFirstname());
//		
//	}
//	@Override
//	public List<Registration> getRegistrationdetails() {
//		System.out.println("This is registration method..");
//		Session s=sf.openSession();
//		
//		Query q=s.createQuery("from Registration");
//		List<Registration> regis=q.list();
//		
//		return regis;
//	}
//
//	@Override
//	public void updateData(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteData(int id) {
//		System.out.println("Welcome to delete method");
//		Session s=sf.openSession();
//		Query a=s.createQuery("delete from Registration where id=:regisId");
//		a.executeUpdate();
//		
//		
//	}
//
//	@Override
//	public void newDataRegis() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
	@Override
	public People getRegistration(int id) {
		System.out.println("In Dao getRegistration..");
		Session session = sf.openSession();
	
		People p=(People)session.get(People.class, id);
      System.out.println("After session...");
	//System.out.println(register.getLastname());
		return p;
	}
//
//	@Override
//	public boolean checkCredentials(String username, String password) {
//		System.out.println("Welcome to the CheckCredentials..");
//		boolean userdata=false;
//		Session session=sf.openSession();
////		Registration regis=(Registration)session.get(Registration.class,username);
////		System.out.println("The name is:"+regis.getFirstname());
//		System.out.println(sf.getClassMetadata(Registration.class));
//		
//		String sql_query="from Registration as r where r.username=? and password=?";
//		Query theQuery=session.createQuery(sql_query);
//		theQuery.setParameter(0, password);
//		theQuery.setParameter(1, username);
//		
//		List list=theQuery.list();
//		
//		if(list!=null && list.size()>0) {
//			userdata=true;
//			return userdata;
//		}
//		else {
//			return userdata;
//		}
//		//theQuery.executeUpdate();
//		
//	}
	@Override
	public void validateVisitor(People r) {
		System.out.println("In DAO IMPL");
		
		Session session=sf.openSession();
		//session.saveOrUpdate(object);
		session.save(r);
		System.out.println("Inserted Successfully..");
		
	}

	@Override
	public List<People> getDetails() {
		Session session=sf.openSession();
		Query q=session.createQuery("from People");
	 
		List<People> l=q.list();
	
	
				
		
		return l;
	}
	@Override
	public void updatePassword(int id,People p) {
		System.out.println("in the update field..");
		String pass=p.getPassword();
		String cpass=p.getCmpassword();
		//People p=new People();
		Session session=sf.openSession();
	Query q=session.createQuery("update People p set password=?,cmpassword=? where p.id=:id");
		//q.setString(0,p.getPassword());
		q.setInteger("id", id);
		//q.setParameter("id", p.getId());
		q.setString(0,pass);
		q.setString(1, cpass);
		//q.setInteger(1, p.getId());
		q.executeUpdate();
		//session.update(p);
	
		
		
		
	}
	@Override
	
	public void updateVisitor(int id,People p) {
		System.out.println("Updataingggg......");
		Session session = sf.openSession();
		Query q1=session.createQuery("update People p set p.username=?,p.id=?,p.email=?,p.phonenumber=?,p.address=? where p.id=:id");
		//q1.setParameter("id", p.getId());
		
		q1.setString(0, p.getUsername());
		q1.setInteger(1, p.getId());
		q1.setString(2, p.getEmail());
		q1.setLong(3, p.getPhonenumber());
		q1.setString(4, p.getAddress());
		q1.setParameter("id", id);
		q1.executeUpdate();
		//session.saveOrUpdate(p);
		// TODO Auto-generated method stub
		
	}

	
		

}
