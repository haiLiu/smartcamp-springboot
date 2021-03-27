package com.ex.smartcamp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_login_log")
public class SysLoginLog {
    /**
     * 编号
     */
    @Id
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 登录状态（online:在线，登录初始状态，方便统计在线人数；login:退出登录后将online置为login；logout:退出登录）
     */
    private String status;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人
     */
    @Column(name = "last_update_by")
    private String lastUpdateBy;

    /**
     * 更新时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取登录状态（online:在线，登录初始状态，方便统计在线人数；login:退出登录后将online置为login；logout:退出登录）
     *
     * @return status - 登录状态（online:在线，登录初始状态，方便统计在线人数；login:退出登录后将online置为login；logout:退出登录）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置登录状态（online:在线，登录初始状态，方便统计在线人数；login:退出登录后将online置为login；logout:退出登录）
     *
     * @param status 登录状态（online:在线，登录初始状态，方便统计在线人数；login:退出登录后将online置为login；logout:退出登录）
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取IP地址
     *
     * @return ip - IP地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置IP地址
     *
     * @param ip IP地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新人
     *
     * @return last_update_by - 更新人
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * 设置更新人
     *
     * @param lastUpdateBy 更新人
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    /**
     * 获取更新时间
     *
     * @return last_update_time - 更新时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置更新时间
     *
     * @param lastUpdateTime 更新时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}