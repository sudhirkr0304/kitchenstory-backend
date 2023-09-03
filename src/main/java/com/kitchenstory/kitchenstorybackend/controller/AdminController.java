package com.kitchenstory.kitchenstorybackend.controller;

import com.kitchenstory.kitchenstorybackend.dto.AdminLoginRequestDto;
import com.kitchenstory.kitchenstorybackend.entity.AdminUser;
import com.kitchenstory.kitchenstorybackend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @PostMapping("/login")
    public AdminUser login(@RequestBody AdminLoginRequestDto adminLoginRequestDto) {

        System.out.println(adminLoginRequestDto.getUsername());
        System.out.println(adminLoginRequestDto.getPassword());

        return adminService.login(adminLoginRequestDto.getUsername(), adminLoginRequestDto.getPassword());
    }


    @PostMapping("/changepassword")
    public AdminUser changePassword(@RequestBody AdminLoginRequestDto adminLoginRequestDto) {

        System.out.println(adminLoginRequestDto.getUsername());
        System.out.println(adminLoginRequestDto.getPassword());

        return adminService.changePassword(adminLoginRequestDto.getUsername(), adminLoginRequestDto.getPassword());
    }
}
