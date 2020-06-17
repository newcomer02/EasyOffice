import com.imooc.oa.dao.PermissionDao;
import com.imooc.oa.entity.Permission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName PermissionDaoTest
 * @Description TODO
 * @Author Lin
 * @Date 2020/6/17 15:40
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml"})
public class PermissionDaoTest {
    @Autowired
    private PermissionDao permissionDao;

    @Test
    public void getPermissionTest() {
        List<Permission> sysPermission = permissionDao.getPermission(1);
        for (Permission p:
             sysPermission) {
            System.out.println(p.getAuthority());
        }
    }
}
