package com.imooc.oa.biz.impl;

import com.imooc.oa.biz.EmployeeBiz;
import com.imooc.oa.dao.EmployeeDao;
import com.imooc.oa.dao.RoleDao;
import com.imooc.oa.entity.Employee;
import com.imooc.oa.entity.User_role;
import com.imooc.oa.global.Contant;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @ClassName EmployeeBizImpl
 * @Description TODO
 * @Author Lin
 * @Date 2020/5/5 0:14
 * @Version 1.0
 */

@Service("employeeBiz")
public class EmployeeBizImpl implements EmployeeBiz {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private RoleDao roleDao;

    public void add(Employee employee) {
        // 默认密码 000000
        employee.setPassword(new Md5Hash("000000",employee.getSn()).toString());
        employeeDao.insert(employee);

        String role_name = null;
        if (employee.getPost().equals(Contant.POST_GM)) {
            role_name = "GM";
        }
        else if (employee.getPost().equals(Contant.POST_FM)) {
            role_name = "FM";
        }
        else if (employee.getPost().equals(Contant.POST_CASHIER) || employee.getPost().equals(Contant.POST_STAFF)) {
            role_name = "STAFF";
        }

        Integer id = roleDao.selectByRoleName(role_name);
        User_role user_role = new User_role();
        user_role.setUser_id(employee.getSn());
        user_role.setRole_id(id);

        roleDao.insert(user_role);
    }

    public void edit(Employee employee) {
        employeeDao.update(employee);
    }

    public void remove(String sn) {
        employeeDao.delete(sn);
    }

    public Employee get(String sn) {
        return employeeDao.select(sn);
    }

    public List<Employee> getAll() {
        return employeeDao.selectAll();
    }
}
