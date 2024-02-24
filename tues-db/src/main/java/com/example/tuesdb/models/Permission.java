package com.example.tuesdb.models;

import jakarta.persistence.*;

@Entity
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String type;

    public Long getId(){
        return this.id;
    }

    public String getType(){
        return this.type;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setType(String groupName){
        this.type = groupName;
    }

}
