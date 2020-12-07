package com.mayikt.feign;

import com.mayikt.entity.AppEntity;
import com.mayikt.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 * @Description:通过feign进行服务之间的调用
 * @Param:
 * @return:Anything
 * @date 2020-12-07 14:52:42
 */
@FeignClient(name = "app-mayikt-weixin")
public interface WeiXinServiceFeign extends WeiXinService {
//    @GetMapping("/getApp")
//    public AppEntity getApp();
}
