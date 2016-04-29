package com.highpay.zoom.dubbo.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.highpay.zoom.dubbo.user.entity.User;
import com.highpay.zoom.dubbo.user.inter.IUserService;
@Component
@Service(version="1.0")
public class UserServiceImpl implements IUserService {
	
   public List<User> getUsers() {  
       List<User> list = new ArrayList<User>();  
       User u1 = new User();  
       u1.setName("fang boss");  
       u1.setAge(20);  
       u1.setSex("男");  
         
       User u2 = new User();  
       u2.setName("shuaixuan");  
       u2.setAge(21);  
       u2.setSex("男");  
         
       User u3 = new User();  
       u3.setName("coder");  
       u3.setAge(19);  
       u3.setSex("男");  
         
       list.add(u1);  
       list.add(u2);  
       list.add(u3);  
       return list;  
   } 
}
