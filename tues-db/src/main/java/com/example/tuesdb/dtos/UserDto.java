package com.example.tuesdb.dtos;

import com.example.tuesdb.models.User;

public class UserDto {

    private Long id;
    private String username;
    private String email;

    public UserDto(User a){
        this.id = a.getId();
        this.username = a.getUsername();
        this.email = a.getEmail();
    }

    public Long getId(){
        return this.id;
    }

    public String getUsername(){
        return this.username;
    }

    public String getEmail(){
        return this.username;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
