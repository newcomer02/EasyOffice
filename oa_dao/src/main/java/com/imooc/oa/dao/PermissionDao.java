package com.imooc.oa.dao;

import com.imooc.oa.entity.Permission;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository("permissionDao")
public interface PermissionDao {
    List<Permission> getPermission(Integer role_id);
}
