package org.mapper;

import org.apache.ibatis.annotations.Param;
import org.pojo.Brand;

import java.util.List;
import java.util.Map;

/**
 * @Author
 * @Date 2022/12/11 17:18
 * @Description
 **/
public interface BrandMapper {
    public List<Brand> selsectAll();
    public Brand selectById(int id);

    public void insertOne(Brand brand);

    /**
     * 条件查询
     *  参数接收
     *      1.散装参数：如果方法中有多个参数，需要使用@Param("SQL参数占位符名称")注解标注
     *      2.对象参数：对象的属性名称要和参数占位符名称一致
     *      3.Map集合参数
     */
    List<Brand> selectByCondition(@Param("status")int status,
                                  @Param("companyName") String companyName,
                                  @Param("brandName") String brandName);

    List<Brand> selectByCondition2(Brand brand);

    List<Brand> selectByCondition3(Map map);

    List<Brand> selectByCondition4(Map map);

    List<Brand> selectByCondition5(Brand brand);

    List<Brand> selectByCondition6(Brand brand);
}
