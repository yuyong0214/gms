package com.yong.gmspro.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yong.gmspro.entity.Product;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


/**
 * @author: YUY
 * @date: 2019/5/20 11:13
 */
public interface IProductService extends IService<Product> {
    public Map<String, String> decrease(@RequestParam("pro_id") Long id,
                                        @RequestParam("buyNum") Integer buyNum);
}
