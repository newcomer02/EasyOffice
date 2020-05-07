package com.imooc.oa.entity;

/**
 * @ClassName Department
 * @Description 部门实体类
 * @Author Lin
 * @Date 2020/5/3 22:53
 * @Version 1.0
 */
public class Department {
    private String sn;
    private String name;
    private String address;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
