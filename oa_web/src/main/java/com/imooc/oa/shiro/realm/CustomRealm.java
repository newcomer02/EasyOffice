package com.imooc.oa.shiro.realm;

import com.imooc.oa.dao.EmployeeDao;
import com.imooc.oa.dao.PermissionDao;
import com.imooc.oa.dao.RoleDao;
import com.imooc.oa.entity.Employee;
import com.imooc.oa.entity.Permission;
import com.imooc.oa.entity.Role;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName CustomRealm
 * @Description TODO
 * @Author Lin
 * @Date 2020/6/15 12:32
 * @Version 1.0
 */
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private PermissionDao permissionDao;
    @Autowired
    private RoleDao roleDao;

    // 用户授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Employee employee = (Employee) principalCollection.getPrimaryPrincipal();
        Role role = roleDao.select(employee.getSn());
        List<Permission> per = permissionDao.getPermission(role.getId());
        Set<String> set = new HashSet<String>();
        for (Permission p:
             per) {
            set.add(p.getAuthority());
        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(set);

        return info;
    }

    // 用户认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = token.getPrincipal().toString();
        if (username == null) {
            System.out.println("username is null");
            return null;
        }

        Employee employee = employeeDao.select(username);

        if (employee == null) {
            return null;
        }

        return new SimpleAuthenticationInfo(employee, employee.getPassword(), ByteSource.Util.bytes(username),"MyRealm");
    }
}
