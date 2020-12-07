package com.mayikt.weixin.service;

import com.mayikt.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 * @Description:
 * @Param:
 * @return:Anything
 * @date 2020-12-04 14:36:56
 */
public interface WeiXinService {

    @GetMapping("/getApp")
    public AppEntity getApp();
}
