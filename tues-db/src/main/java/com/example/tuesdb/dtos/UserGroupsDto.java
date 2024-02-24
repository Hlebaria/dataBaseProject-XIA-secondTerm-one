package com.example.tuesdb.dtos;

import com.example.tuesdb.models.UserGroups;

public class UserGroupsDto {

    private Long id;
    private Long userId;
    private Long groupId;

    public UserGroupsDto (UserGroups a){
        this.id = a.getId();
        this.userId = a.getUser().getId();
        this.groupId = a.getGroup().getId();
    }

    public Long getId(){
        return this.id;
    }

    public Long getUserId(){
        return this.userId;
    }

    public Long getGroupId(){
        return this.groupId;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public void setGroupId(Long groupId){
        this.groupId = groupId;
    }

}