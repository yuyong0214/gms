package com.yong.gmspro;

import com.yong.gmspro.entity.Product;
import com.yong.gmspro.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmsProApplicationTests {

    @Autowired
    private IProductService productService;
    @Test
    public void insert() {
        Product product = new Product();
        product.setProductName("");
        product.setProductNo("");
        product.setPrice(0.0D);
        product.setProductPic("");
        product.setPageView(0);
        product.setInventory(0);
        product.setDescription("");
        product.setStatus(0);
        productService.save(product);
    }

    @Test
    public void update(){
        Product product = productService.getById(5);
        product.setPrice(23d);
        productService.updateById(product);
    }

}
