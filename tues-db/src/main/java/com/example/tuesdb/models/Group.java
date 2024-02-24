package com.example.tuesdb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String groupName;

    public Long getId(){
        return this.id;
    }

    public String getGroupName(){
        return this.groupName;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

}