package com.yong.gmspro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 * @author: YUY
 * @date: 2019/5/20 10:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    @Id
    private Long id;
    private String productName;
    private String productNo;
    private Double price;
    private String productPic;
    private Integer pageView;
    private Integer inventory;
    private String description;
    private Integer status;
}




