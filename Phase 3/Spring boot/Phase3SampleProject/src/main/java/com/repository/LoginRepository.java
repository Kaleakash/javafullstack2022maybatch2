package com.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

	// custom query base upon our requirement. 
	
	@Query("select l from Login l where l.emailid = :emailid and l.password = :password")
	public Login checkLoginDetails(@Param("emailid") String emailid, @Param("password") String password);
}

