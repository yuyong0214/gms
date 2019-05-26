package com.yong.gmsshoppingcar.server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.gmsshoppingcar.entity.ShoppingCar;
import com.yong.gmsshoppingcar.mapper.ShoppingCarMapper;
import com.yong.gmsshoppingcar.server.IShoppingCarServer;
import org.springframework.stereotype.Service;

/**
 * @author: YUY
 * @date: 2019/5/26 14:50
 */
@Service
public class ShoppingCarServiceImpl extends ServiceImpl<ShoppingCarMapper, ShoppingCar> implements IShoppingCarServer {
}
