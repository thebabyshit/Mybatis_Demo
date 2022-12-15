import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mapper.BrandMapper;
import org.pojo.Brand;
import org.utils.MybatisUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void test02(){
        SqlSession ss = MybatisUtil.getSqlSessionFactory().openSession();
        BrandMapper brandMapper = ss.getMapper(BrandMapper.class);
       Brand brand = brandMapper.selectById(2);
        System.out.println(brand);
    }

    @Test
    public void test03(){
        SqlSession ss = MybatisUtil.getSqlSessionFactory().openSession();
        BrandMapper brandMapper = ss.getMapper(BrandMapper.class);
        Brand brand = new Brand(4,"JavaBigData","NIIT",5,"2022",6);
        brandMapper.insertOne(brand);
        ss.commit();
        List<Brand> list = brandMapper.selsectAll();
        for(Brand b:list){
            System.out.println(b);
        }
    }

    @Test
    public void test04(){
        SqlSession ss = MybatisUtil.getSqlSessionFactory().openSession();
        BrandMapper brandMapper = ss.getMapper(BrandMapper.class);
        Brand brand = new Brand();
        brand.setStatus(1);
        brand.setCompanyName("%华为%");
        brand.setBrandName("%华为%");
        List<Brand> list = brandMapper.selectByCondition2(brand);
        for(Brand b:list){
            System.out.println(b);
        }
    }

    @Test
    public void test05(){
        SqlSession ss = MybatisUtil.getSqlSessionFactory().openSession();
        BrandMapper brandMapper = ss.getMapper(BrandMapper.class);

        List<Brand> list = brandMapper.selectByCondition(1,"%华为%","%华为%");

        for(Brand b:list){
            System.out.println(b);
        }
    }

    @Test
    public void test06(){
        SqlSession ss = MybatisUtil.getSqlSessionFactory().openSession();
        BrandMapper brandMapper = ss.getMapper(BrandMapper.class);

        Map map = new HashMap<>();
        map.put("status",1);
        map.put("companyName","%华为%");
        map.put("brandName","%华为%");
        List<Brand> list = brandMapper.selectByCondition3(map);

        for(Brand b:list){
            System.out.println(b);
        }
    }

    @Test
    public void test07(){
        SqlSession ss = MybatisUtil.getSqlSessionFactory().openSession();
        BrandMapper brandMapper = ss.getMapper(BrandMapper.class);

        Map map = new HashMap<>();
//        map.put("status",1);
//        map.put("companyName","%华为%");
        map.put("brandName","%华为%");
        List<Brand> list = brandMapper.selectByCondition4(map);

        for(Brand b:list){
            System.out.println(b);
        }
    }

    @Test
    public void test08(){
        SqlSession ss = MybatisUtil.getSqlSessionFactory().openSession();
        BrandMapper brandMapper = ss.getMapper(BrandMapper.class);

        Brand brand = new Brand();
//        brand.setBrandName("%华为%");
        List<Brand> list = brandMapper.selectByCondition5(brand);

        for(Brand b:list){
            System.out.println(b);
        }
    }


    @Test
    public void test09(){
        SqlSession ss = MybatisUtil.getSqlSessionFactory().openSession();
        BrandMapper brandMapper = ss.getMapper(BrandMapper.class);

        Brand brand = new Brand();
//        brand.setBrandName("%华为%");
        List<Brand> list = brandMapper.selectByCondition5(brand);

        for(Brand b:list){
            System.out.println(b);
        }
    }

}
