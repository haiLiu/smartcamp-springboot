package com.ex.smartcamp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Cart {
    @Id
    private String id;

    /**
     * 用户Id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 营地Id
     */
    @Column(name = "camp_id")
    private String campId;

    /**
     * 购买数量
     */
    private Integer number;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户Id
     *
     * @return user_id - 用户Id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户Id
     *
     * @param userId 用户Id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取营地Id
     *
     * @return camp_id - 营地Id
     */
    public String getCampId() {
        return campId;
    }

    /**
     * 设置营地Id
     *
     * @param campId 营地Id
     */
    public void setCampId(String campId) {
        this.campId = campId;
    }

    /**
     * 获取购买数量
     *
     * @return number - 购买数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置购买数量
     *
     * @param number 购买数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
}