package com.kitchenstory.kitchenstorybackend.dto;

public class AdminLoginRequestDto {

    String username;
    String password;

    public AdminLoginRequestDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public AdminLoginRequestDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
