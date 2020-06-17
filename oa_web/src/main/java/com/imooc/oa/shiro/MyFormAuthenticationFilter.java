package com.imooc.oa.shiro;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @ClassName MyFormAuthenticationFilter
 * @Description TODO
 * @Author Lin
 * @Date 2020/6/15 17:50
 * @Version 1.0
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {
    @Override
    protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {
        WebUtils.issueRedirect(request, response, getSuccessUrl(), null, true);
    }
}
