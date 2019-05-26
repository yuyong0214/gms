package com.yong.gmsshoppingcar.controller;

import com.yong.gmsshoppingcar.entity.ShoppingCar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: YUY
 * @date: 2019/5/26 14:57
 */
@Controller
@RequestMapping("shopping_car")
public class ShoppingCarController {

    /**
     * 需要提供以下方法
     * 1、展示购物车中所有的商品（分页）
     * 2、删除某个或某几个商品
     * 3、下订单某个或某几个商品（下单成功后需要删除购物车中的商品）
     * 4、修改商品个数
     */

    public List<ShoppingCar> listShoppingCar(){

        return null;
    }

    public String deleteProdeucts(){
        return "";
    }
}
