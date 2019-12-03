package com.hardelele.ct.models;

import javax.persistence.*;

@Entity
public class RoleEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "name")
    private String roleName;

    public RoleEntity() {
    }

    public RoleEntity(String roleName) {
        this.roleName = roleName;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
