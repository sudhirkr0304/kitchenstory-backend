package com.kitchenstory.kitchenstorybackend.service;

import com.kitchenstory.kitchenstorybackend.entity.AdminUser;
import com.kitchenstory.kitchenstorybackend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;


    public AdminUser login(String username, String password){

        List<AdminUser> list = adminRepository.findByUsernameAndPassword(username,password);

        System.out.println(list);

        if(list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public AdminUser changePassword(String username, String newPassword)
    {
        List<AdminUser> list = adminRepository.findByUsername(username);

        if(list != null && !list.isEmpty()) {

            System.out.println(username);
            System.out.println(newPassword);
            adminRepository.updatePassword(username,newPassword);
            List<AdminUser> list2 = adminRepository.findByUsername(username);
            return list.get(0);
        }
        else {
            return  null;
        }



    }
}
