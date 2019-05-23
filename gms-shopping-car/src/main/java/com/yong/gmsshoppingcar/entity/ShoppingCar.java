package com.yong.gmsshoppingcar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: YUY
 * @date: 2019/5/23 19:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShoppingCar {
    private Long id;
    private String productNo;
    private Integer productNum;
    private String productPic;
    private String productDescription;
    private String productStatus;
}
