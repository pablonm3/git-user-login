package com.accenture.userLogin.repository.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.accenture.userLogin.model.UserLogin;
import com.accenture.userLogin.repository.dao.UserLoginDao;

@Repository
public class UserLoginDaoImpl implements UserLoginDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean verificarIdentidad(String user, String password) {
		Session session = sessionFactory.openSession();
		UserLogin login = session.get(UserLogin.class, user);
		session.close();
		if(login == null)
			return false;
		return password.equals(login.getPassword());
	}

	
	
	
	
	
}
