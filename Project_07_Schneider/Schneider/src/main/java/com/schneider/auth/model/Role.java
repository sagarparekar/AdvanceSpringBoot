package com.schneider.auth.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "UserRole")
public class Role implements Serializable {

    @Id
    @GeneratedValue
    private int roleId;
    private String roleName;
    private Date createdDate;
    private Date modifiedDate;

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public Role() {
    }

    public Role(Integer roleId) {
        super();
        this.roleId = roleId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return this.roleName;
    }
}
