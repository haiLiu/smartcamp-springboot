package com.ex.smartcamp.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 用户Id
     */
    @Column(name = "id")
    private String id;

    /**
     * 用户名称
     */
    @Column(name = "username")
    private String username;

    /**
     * 用户密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 用户状态（1：正常，0：暂停）
     */
    @Column(name = "status")
    private Byte status;

    /**
     * 用户昵称
     */
    @Column(name = "nick_name")
    private String nick_name;

    /**
     * 用户头像
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 加密盐
     */
    @Column(name = "salt")
    private String salt;

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 手机
     */
    @Column(name = "mobile")
    private String mobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}