package co.com.jwtroledbase.service;

import java.util.List;

import co.com.jwtroledbase.model.User;

public interface IUserService {
	
	public List<User> findAll();
	
	public User save(User user);
}
