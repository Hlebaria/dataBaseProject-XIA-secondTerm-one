package com.example.tuesdb.models;

import jakarta.persistence.*;

@Entity
public class UserGroups {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    public Long getId(){
        return this.id;
    }

    public User getUser(){
        return this.user;
    }

    public Group getGroup(){
        return this.group;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setUser(User user){
        this.user = user;
    }

    public void setGroup(Group group){
        this.group = group;
    }

}
