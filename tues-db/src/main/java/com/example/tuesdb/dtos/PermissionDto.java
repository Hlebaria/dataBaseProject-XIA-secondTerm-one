package com.example.tuesdb.dtos;

import com.example.tuesdb.models.Permission;

public class PermissionDto {

    private Long id;
    private String type;

    public PermissionDto(Permission a){
        this.id = a.getId();
        this.type = a.getType();
    }

    public Long getId(){
        return this.id;
    }

    public String getType(){
        return this.type;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setType(String type){
        this.type = type;
    }

}
