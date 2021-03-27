package com.ex.smartcamp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Focus {
    /**
     * 收藏id
     */
    @Id
    private String id;

    /**
     * 营地编号
     */
    @Column(name = "camp_id")
    private String campId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 收藏时间
     */
    private Date focustime;

    /**
     * 获取收藏id
     *
     * @return id - 收藏id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置收藏id
     *
     * @param id 收藏id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取营地编号
     *
     * @return camp_id - 营地编号
     */
    public String getCampId() {
        return campId;
    }

    /**
     * 设置营地编号
     *
     * @param campId 营地编号
     */
    public void setCampId(String campId) {
        this.campId = campId;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取收藏时间
     *
     * @return focustime - 收藏时间
     */
    public Date getFocustime() {
        return focustime;
    }

    /**
     * 设置收藏时间
     *
     * @param focustime 收藏时间
     */
    public void setFocustime(Date focustime) {
        this.focustime = focustime;
    }
}