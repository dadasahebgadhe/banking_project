package com.javatodev.finance.service;

import com.javatodev.finance.model.entity.User;
import com.javatodev.finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
  @Autowired
  private  UserRepository userRepository;
  public User saveUser(User user){
      return userRepository.save(user);
  }
    public User saveUsers(List<User> users){
        return userRepository.saveAll(users);
    }
    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User updateUser(User user){
      User olduser= userRepository.findById(user.getId()).orElse(null);
      if(olduser!=null){
          olduser.setName(user.getName());
          olduser.setEmail(user.getEmail());
          olduser.setMobileNumber(user.getMobileNumber());
          olduser.setSecondaryNumber(user.getSecondaryNumber());
          olduser.setMobileNumber(user.getMobileNumber())
          return userRepository.save(user);
      }
        return userRepository.save(new User());

    }
    public String deleteById(Long id){
         userRepository.deleteById(id);
         return "user deleted";

    }
}
