package com.imooc.oa.entity;


/**
 * @ClassName User_role
 * @Description TODO
 * @Author Lin
 * @Date 2020/6/17 12:05
 * @Version 1.0
 */
public class User_role {
    private Integer id;
    private String user_id;
    private Integer role_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }
}
