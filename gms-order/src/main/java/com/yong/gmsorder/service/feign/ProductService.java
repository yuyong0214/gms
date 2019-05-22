package com.yong.gmsorder.service.feign;

import com.yong.gmsproapi.IOProductService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: YUY
 * @date: 2019/5/21 15:22
 */
@FeignClient("gms-pro-server")
public interface ProductService extends IOProductService {
}
