package org.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author
 * @Date 2022/12/12 9:34
 * @Description
 **/
public class MybatisUtil {
    public static SqlSessionFactory ssf;

    public static SqlSessionFactory getSqlSessionFactory() {
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            ssf = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ssf;

    }
}
