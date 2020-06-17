package com.imooc.oa.entity;


/**
 * @ClassName Permission
 * @Description TODO
 * @Author Lin
 * @Date 2020/6/17 15:11
 * @Version 1.0
 */
public class Permission {
    private Integer id;
    private Integer role_id;
    private Integer per_id;
    private String authority;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getPer_id() {
        return per_id;
    }

    public void setPer_id(Integer per_id) {
        this.per_id = per_id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", role_id=" + role_id +
                ", per_id=" + per_id +
                ", authority='" + authority + '\'' +
                '}';
    }
}
