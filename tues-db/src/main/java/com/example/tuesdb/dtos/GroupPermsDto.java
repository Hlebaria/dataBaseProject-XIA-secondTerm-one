package com.example.tuesdb.dtos;

import com.example.tuesdb.models.GroupPerms;

public class GroupPermsDto {

    private Long id;
    private Long groupId;
    private Long permissionId;

    public GroupPermsDto (GroupPerms a){
        this.id = a.getId();
        this.groupId = a.getGroup().getId();
        this.permissionId = a.getPermission().getId();
    }

    public Long getId(){
        return this.id;
    }

    public Long getGroupId(){
        return this.groupId;
    }

    public Long getPermissionId(){
        return this.permissionId;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setGroupId(Long groupId){
        this.groupId = groupId;
    }

    public void setPermissionId(Long permissionId){
        this.permissionId = permissionId;
    }

}
