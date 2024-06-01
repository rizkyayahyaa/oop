package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.User;
import com.bookStore.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    public boolean authenticate(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        return user != null;
    }
    public void save(User user) {
        userRepository.save(user);
    }
    
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getAllUsers(int id) {
		return userRepository.findById(id).get();
	}
	public void deleteById(int id) {
		userRepository.deleteById(id);
	}
    // Tambahkan method lain sesuai kebutuhan, seperti mencari user berdasarkan username, dll.
}
