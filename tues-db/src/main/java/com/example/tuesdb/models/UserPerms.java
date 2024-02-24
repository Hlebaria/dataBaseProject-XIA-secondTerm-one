package com.example.tuesdb.models;

import jakarta.persistence.*;

@Entity
public class UserPerms {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "permission_id")
    private Permission permission;

    public Long getId(){
        return this.id;
    }

    public User getUser(){
        return this.user;
    }

    public Permission getPermission(){
        return this.permission;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setUser(User user){
        this.user = user;
    }

    public void setPermission (Permission permission){
        this.permission = permission;
    }

}
