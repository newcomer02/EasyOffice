package com.imooc.oa.entity;

/**
 * @ClassName role
 * @Description TODO
 * @Author Lin
 * @Date 2020/6/17 11:56
 * @Version 1.0
 */
public class Role {
    private Integer id;
    private String role_name;
    private User_role user_role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public User_role getUser_role() {
        return user_role;
    }

    public void setUser_role(User_role user_role) {
        this.user_role = user_role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role_name='" + role_name + '\'' +
                ", user_role=[" + user_role.getId() +", "+ user_role.getUser_id() +", "+ user_role.getRole_id()+"]"+
                '}';
    }
}
