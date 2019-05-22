package com.yong.gmsorder.controller;


import com.yong.gmsorder.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YUY
 * @since 2019-05-21
 */
@RestController
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    private OrdersServiceImpl ordersService;

    @PostMapping("book")
    public Map orderBook(@RequestParam("id") Long id,
                         @RequestParam("num") Integer num)
    {
        Map map = new HashMap();
        boolean b = ordersService.placeOrder(id, num);
        if (b) {
            map.put("code", "123456");
            map.put("msg", "success");
        } else {
            map.put("code", "000000");
            map.put("msg", "fail");
        }
        return map;
    }

}
