package com.mayikt.entity;

import lombok.Data;

/**
 * @author Administrator
 * @Description:
 * @Param:
 * @return:Anything
 * @date 2020-12-04 14:34:55
 */
@Data
public class AppEntity {
    private String id;
    private String name;

    public AppEntity() {

    }

    public AppEntity(String id, String name) {
        super();
        this.id=id;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}