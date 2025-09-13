package com.example.usercls;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.userdetails;
import com.example.user.repo.userRepo;
@Service
public  class userser implements userserv {
     private userRepo userRepo;
     

	public userser(com.example.user.repo.userRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public List<userdetails> getAlluserdetails() {
		return userRepo.findAll();
	}

	@Override
	public userdetails getuserdetails(long id) {
		// TODO Auto-generated method stub
		return null;
	}
    @Override
	public  userdetails saveUser(userdetails u) {
		
		return userRepo.save(u);
	}

	@Override
	public userdetails getUserdetailsById(Long id) {
		
		return userRepo.findById(id).get();
	}

	@Override
	public userdetails updateUserdetails(userdetails u) {
		
		return userRepo.save(u);
	}

	@Override
	public void deleteUserById(Long id) {
		 userRepo.deleteById(id);
		
	}
    


	}
