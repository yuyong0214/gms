package com.yong.gmsorder.service.impl;

import com.yong.gmsorder.entity.Orders;
import com.yong.gmsorder.mapper.OrdersMapper;
import com.yong.gmsorder.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.gmsorder.service.feign.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YUY
 * @since 2019-05-21
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

    @Autowired(required = false)
    private OrdersMapper ordersMapper;

    @Autowired(required = false)
    private ProductService productService;

    @Override
    public boolean placeOrder(Long produceId, int produceNum) {
        //先执行扣减商品
        Map<String, String> decrease = productService.decrease(produceId, produceNum);
        //扣减成功
        if (decrease.get("status").equals("111111")) {
        //再执行添加订单
            Orders orders = new Orders();
            orders.setId(23L);
            orders.setOrderNo(UUID.randomUUID().toString().replaceAll("-","").toUpperCase());
            orders.setProductNo("1");
            orders.setCreateTime(new Date());
            this.save(orders);
        }

        return false;
    }
}
