package com.yong.gmspro.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.gmspro.entity.Product;
import com.yong.gmspro.mapper.ProductMapper;
import com.yong.gmspro.service.IOProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: YUY
 * @date: 2019/5/21 10:48
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IOProductService {

    @Autowired(required = false)
    private ProductMapper productMapper;

    @Override
    public Map<String, String> decrease(Long id, Integer buyNum) {
        /**
         * 这里需要使用分布式锁来操作数据的一致性
         */

        String message = "库存扣减失败";
        String status = "000000";
        Map<String, String> map = new ConcurrentHashMap<>();
        Product product = productMapper.selectById(id);
        //如果库存大于购买数量
        if (product.getInventory()>=buyNum) {
            product.setInventory(product.getInventory()-buyNum);
            productMapper.updateById(product);
            message = "库存扣减成功";
            status = "111111";
        }
        map.put("message",message);
        map.put("status",status);
        return map;
    }
}
