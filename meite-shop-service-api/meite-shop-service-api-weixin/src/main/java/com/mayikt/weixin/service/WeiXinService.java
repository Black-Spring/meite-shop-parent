package com.mayikt.weixin.service;

import com.mayikt.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 * @Description:
 * @Param:
 * @return:Anything
 * @date 2020-12-04 14:36:56
 */
@Api(tags = "微信服务接口")
public interface WeiXinService {

    @GetMapping("/getApp")
    @ApiOperation("获取微信信息")
    public AppEntity getApp();
}
