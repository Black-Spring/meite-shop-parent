package com.mayikt.Member.service;

import com.mayikt.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 * @Description:
 * @Param:
 * @return:Anything
 * @date 2020-12-04 15:17:54
 */
public interface MemberService {

    @GetMapping("/getMeneberToWeiXin")
    public AppEntity MemberToWeiXin();

}
