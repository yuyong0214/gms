package com.yong.gmsorder;

import com.yong.gmsorder.entity.Orders;
import com.yong.gmsorder.service.impl.OrdersServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmsOrderApplicationTests {

    @Autowired
    private OrdersServiceImpl ordersService;

    @Test
    public void contextLoads() {
        Orders orders = new Orders();
        orders.setId(1L);
        orders.setOrderNo("123123123");
        orders.setProductNo("asdfasdfasdf");
        orders.setCreateTime(new Date());
        ordersService.save(orders);
    }

}
