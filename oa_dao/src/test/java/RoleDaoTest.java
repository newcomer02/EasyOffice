import com.imooc.oa.dao.RoleDao;
import com.imooc.oa.entity.Role;
import com.imooc.oa.entity.User_role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName RoleDaoTest
 * @Description TODO
 * @Author Lin
 * @Date 2020/6/17 14:15
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml"})
public class RoleDaoTest {
    @Autowired
    private RoleDao roleDao;

    @Test
    public void getRoleMessage() {
//        Role role = roleDao.select("10001");
//        System.out.println(role);
        // 添加
        Integer id = roleDao.selectByRoleName("STAFF");
        User_role user_role = new User_role();
        user_role.setUser_id("10011");
        user_role.setRole_id(id);
        roleDao.insert(user_role);

        // 查询
        Role role = roleDao.select("10011");
        System.out.println(role);

        // 删除
        roleDao.delete("10011");
    }
}
