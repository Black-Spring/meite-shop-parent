package com.mayikt.weixin.service.impl;

import com.mayikt.entity.AppEntity;
import com.mayikt.weixin.service.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Description:
 * @Param:
 * @return:Anything
 * @date 2020-12-04 14:48:41
 */
@RestController
public class WeiXinServiceImpl implements WeiXinService {

    @Override
    public AppEntity getApp() {
        return new AppEntity("1111","aaaaaa");
    }
}