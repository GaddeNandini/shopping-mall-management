package com.example.usercls;
import java.util.List;

import com.example.user.userdetails;
import com.example.user.repo.userRepo;
public interface userserv {

public userdetails getuserdetails(long id);
 public List<userdetails>getAlluserdetails();
 userdetails saveUser(userdetails u);
 userdetails getUserdetailsById(Long id);
 
 userdetails updateUserdetails(userdetails u);
 void deleteUserById(Long id);
	 
}


