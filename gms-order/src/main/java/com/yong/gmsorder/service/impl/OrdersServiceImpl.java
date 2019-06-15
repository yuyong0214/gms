package com.yong.gmsorder.service.impl;

import com.yong.gmsorder.entity.Orders;
import com.yong.gmsorder.mapper.OrdersMapper;
import com.yong.gmsorder.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.gmsorder.service.feign.ProductClient;
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
    private ProductClient productClient;

    @Override
    public boolean placeOrder(Long produceId, int produceNum) {
        //先执行扣减商品
        Map<String, String> decrease = productClient.decrease(produceId, produceNum);
        //扣减成功
        if (decrease.get("status").equals("111111")) {
        //再执行添加订单
            Orders orders = new Orders();
            orders.setOrderNo(UUID.randomUUID().toString().replaceAll("-","").toUpperCase());
            orders.setProductNo("1");
            orders.setCreateTime(new Date());
            orders.setPurchase(produceNum);
            this.save(orders);
            return true;
        }

        return false;
    }
}
