package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Login;
import com.resource.SessionFactoryResource;

public class LoginDao {

	public int signUp(Login login) {
		try {
		SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
				session.save(login);
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int signIn(Login login) {
		SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
		Session session = sf.openSession();
		Query<Login> qry = session.createQuery("select l from Login l where l.emailid = :email and l.password = :password");		//HQL 
		qry.setParameter("email", login.getEmailid());
		qry.setParameter("password", login.getPassword());
		List<Login> ll = qry.list();
		return ll.size();
	}
}
