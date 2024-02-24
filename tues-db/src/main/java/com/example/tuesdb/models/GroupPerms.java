package com.example.tuesdb.models;

import jakarta.persistence.*;

@Entity
public class GroupPerms {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    @ManyToOne
    @JoinColumn(name = "permission_id")
    private Permission permission;

    public Long getId(){
        return this.id;
    }

    public Group getGroup(){
        return this.group;
    }

    public Permission getPermission(){
        return this.permission;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setGroup(Group group){
        this.group = group;
    }

    public void setPermission(Permission permission){
        this.permission = permission;
    }

}
