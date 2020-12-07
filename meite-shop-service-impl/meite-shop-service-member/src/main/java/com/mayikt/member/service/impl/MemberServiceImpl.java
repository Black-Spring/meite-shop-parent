package com.mayikt.member.service.impl;

import com.mayikt.Member.service.MemberService;
import com.mayikt.entity.AppEntity;
import com.mayikt.feign.WeiXinServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Description:
 * @Param:
 * @return:Anything
 * @date 2020-12-04 15:21:39
 */
@RestController
public class MemberServiceImpl implements MemberService {
    @Autowired
    private WeiXinServiceFeign weiXinServiceFeign;
    @Override
    public AppEntity MemberToWeiXin() {
        return weiXinServiceFeign.getApp();
    }
}