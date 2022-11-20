package com.dev.neo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dev.neo.model.User;
import com.dev.neo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repo;

	public User saveData(User user) {
		return repo.save(user);
	}

	public List<User> listAll() {

		return repo.findAll();
	}

	public Optional<User> delete(Integer id) {
		return repo.findById(id);

	}

	public static List<User> searchUsers(String query) {
		List<User> usr = UserRepository.searchUsersSQL(query);
		return usr;
	}

}
