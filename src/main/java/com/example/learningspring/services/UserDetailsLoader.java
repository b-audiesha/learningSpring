package com.example.learningspring.services;

import com.example.learningspring.models.UserWithRoles;
import com.example.learningspring.repositories.UserRepo;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsLoader implements UserDetailsService {
  private final UserRepo userDao;

  public UserDetailsLoader(UserRepo userDao) {
    this.userDao = userDao;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userDao.findByUsername(username);
    if (user == null) {
      throw new UsernameNotFoundException("No user found for " + username);
    }

    return new UserWithRoles(user);
  }
}
