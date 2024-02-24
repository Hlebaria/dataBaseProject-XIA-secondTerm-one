package com.example.tuesdb.dtos;

import com.example.tuesdb.models.Group;

public class GroupDto {

    private Long id;
    private String groupName;

    public GroupDto (Group a){
        this.id = a.getId();
        this.groupName = a.getGroupName();
    }

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
