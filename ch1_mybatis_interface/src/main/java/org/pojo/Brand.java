package org.pojo;

import lombok.Data;
import lombok.ToString;

/**
 * @Author
 * @Date 2022/12/11 17:09
 * @Description
 **/
@Data
@ToString
public class Brand {
    private Integer id;
    private String brandName;
    private String companyName;
    private Integer ordered;
    private String description;
    private Integer status;


}
