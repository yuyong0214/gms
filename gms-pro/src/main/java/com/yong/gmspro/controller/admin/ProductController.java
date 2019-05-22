package com.yong.gmspro.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.yong.gmspro.entity.Product;
import com.yong.gmspro.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: YUY
 * @date: 2019/5/20 11:15
 */
@Controller
@RequestMapping("admin")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping("list")
    public String productList(){
        QueryChainWrapper<Product> query = productService.query();
        System.out.println(query);
        return null;
    }

    @RequestMapping("add")
    public void add(){
        Product product = new Product();
        product.setProductName("22222");
        product.setProductNo("22222");
        product.setPrice(23.0D);
        product.setProductPic("af");
        product.setPageView(0);
        productService.save(product);
    }
}
