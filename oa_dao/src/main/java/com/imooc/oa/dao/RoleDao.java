package com.imooc.oa.dao;

import com.imooc.oa.entity.Role;
import com.imooc.oa.entity.User_role;
import org.springframework.stereotype.Repository;

@Repository("RoleDao")
public interface RoleDao {
    void insert(User_role user_role);
    Role select(String sn);
    Integer selectByRoleName(String name);
    void delete(String sn);
}
