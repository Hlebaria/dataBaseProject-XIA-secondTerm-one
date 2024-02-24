package com.example.tuesdb.dtos;

import com.example.tuesdb.models.UserPerms;

public class UserPermsDto {

    private Long id;
    private Long userId;
    private Long permissionId;

    public UserPermsDto (UserPerms a){
        this.id = a.getId();
        this.userId = a.getUser().getId();
        this.permissionId = a.getPermission().getId();
    }

    public Long getId(){
        return this.id;
    }

    public Long getUserId(){
        return this.userId;
    }

    public Long getPermissionId(){
        return this.permissionId;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public void setPermissionId(Long permissionId){
        this.permissionId = permissionId;
    }

}
