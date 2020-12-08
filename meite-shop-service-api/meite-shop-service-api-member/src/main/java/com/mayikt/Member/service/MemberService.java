package com.mayikt.Member.service;

import com.mayikt.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 * @Description:利用Swagger进行API文档管理
 * @Param:
 * @return:Anything
 * @date 2020-12-04 15:17:54
 */
@Api(tags = "会员服务接口")
public interface MemberService {

    @ApiOperation(value = "会员调用微信接口")
    @GetMapping("/getMeneberToWeiXin")
    public AppEntity MemberToWeiXin();

}
