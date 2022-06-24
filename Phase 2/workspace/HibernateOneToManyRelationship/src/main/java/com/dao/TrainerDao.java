package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Trainer;

public class TrainerDao {

	
	public int storeTrainerDetails(Trainer trainer) {
		try {
			Configuration con = new Configuration();
			con.configure();
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					 session.save(trainer);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public Trainer findTrainerById(int tid){
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Trainer t = session.get(Trainer.class, tid);
		return t;
	}
	
	
	public List<Object[]> joinTrainerAndStudent() {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		//Query qry = session.createQuery("select t.tname,t.tech,s.sname from Trainer t inner join Student s on t.tid = s.tsid");	// HQL 
		Query qry = session.createNativeQuery("select t.tname,t.tech, s.sname from trainer t inner join student s on t.tid = s.tsid"); // SQL
		
		List<Object[]> obj = qry.list();
		return obj;
	}
	
	public List<Object[]> joinTrainerAndStudentWithCondition(String tname) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		//Query qry = session.createQuery("select t.tname,t.tech,s.sname from Trainer t inner join Student s on t.tid = s.tsid");	// HQL 
		Query qry = session.createNativeQuery("select t.tname,t.tech, s.sname from trainer t inner join student s on t.tid = s.tsid and t.tname = :trainerName"); // SQL
		qry.setParameter("trainerName", tname);
		List<Object[]> obj = qry.list();
		return obj;
	}
	
}
