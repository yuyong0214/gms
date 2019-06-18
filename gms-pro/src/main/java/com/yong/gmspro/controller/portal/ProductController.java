package com.yong.gmspro.controller.portal;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yong.gmspro.entity.Product;
import com.yong.gmspro.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.EntityWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author: YUY
 * @date: 2019/6/18 16:34
 */
@Controller("productProductController")
@RequestMapping("portal")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "indexData/{status}")
    @ResponseBody
    public List<Product> indexData(@PathVariable Integer status){
        // 添加条件
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("status",status);
        List list = iProductService.list(queryWrapper);
        return list;
    }

    @RequestMapping("insert")
    @ResponseBody
    public String insert(Product product){
//        boolean b = false;
//        String result = "";
//        if(product != null){
//            product.setCreateTime(new Date());
//            b = iProductService.save(product);
//        }
//        if(b) result = "操作成功！";
//        return result;
        return null;
    }
}
