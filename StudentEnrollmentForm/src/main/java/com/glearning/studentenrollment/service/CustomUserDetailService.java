package com.glearning.studentenrollment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.glearning.studentenrollment.entity.Users;
import com.glearning.studentenrollment.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users name=userRepository.findByUserName(userName);
		
		CustomUserService userDetails=null;
		if(name !=null)
		{
			userDetails=new CustomUserService();
			userDetails.setUsers(name);
		}
		else {
			throw new UsernameNotFoundException("user not exists with the name "+ userName);
		}
		
		return userDetails;
	}

}
