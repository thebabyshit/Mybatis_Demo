import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mapper.BrandMapper;
import org.pojo.Brand;
import org.utils.MybatisUtil;

import java.util.List;

/**
 * @Author
 * @Date 2022/12/11 17:11
 * @Description
 **/
public class MybatisTest {
    @Test
    public void test01(){
        SqlSession ss = MybatisUtil.getSqlSessionFactory().openSession();
        BrandMapper brandMapper = ss.getMapper(BrandMapper.class);
        List<Brand> list = brandMapper.selsectAll();
//        System.out.println(list);
        for(Brand b:list){
            System.out.println(b);
        }
    }
}
