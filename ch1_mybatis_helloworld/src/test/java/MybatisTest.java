import com.matr1x.entity.User;
import com.matr1x.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author
 * @Date 2022/12/11 9:29
 * @Description
 **/
public class MybatisTest {

    /*
        根据xml配置文件（全局配置文件）创建一个SqlSessionFactory对象
     */
    @Test
    public void test01() throws IOException {
        String resources = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlSession实例，能直接执行sql映射
        SqlSession openSession = sqlSessionFactory.openSession();
        UserDao userDao = openSession.getMapper(UserDao.class);
        User user = userDao.selectUser(1);
        System.out.println(user);

        openSession.close();
    }
}
