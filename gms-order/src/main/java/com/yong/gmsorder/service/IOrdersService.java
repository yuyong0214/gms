package com.yong.gmsorder.service;

import com.yong.gmsorder.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YUY
 * @since 2019-05-21
 */
public interface IOrdersService extends IService<Orders> {
    public boolean placeOrder(Long produceId, int produceNum);

}
