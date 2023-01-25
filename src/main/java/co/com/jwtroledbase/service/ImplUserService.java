package co.com.jwtroledbase.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.jwtroledbase.model.User;
import co.com.jwtroledbase.repository.IUserRepository;

@Service
public class ImplUserService implements IUserService {

	@Autowired
	private IUserRepository userRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	@Transactional
	public User save(User user) {
		return userRepository.save(user);
	}

}
