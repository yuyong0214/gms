package com.yong.gmsproapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 用来暴露接口供订单接口使用减少库存
 *
 * @author: YUY
 * @date: 2019/5/21 10:59
 */
public interface IOProductService {
    @PostMapping("produce/decrease")
    public Map<String, String> decrease(@RequestParam("pro_id") Long id,
                                        @RequestParam("buyNum") Integer buyNum);
}
