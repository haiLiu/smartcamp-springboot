package com.ex.smartcamp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_camp")
public class SysCamp {
    /**
     * 编号
     */
    @Id
    private String id;

    /**
     * 营地详情编号
     */
    @Column(name = "camp_info_id")
    private String campInfoId;

    /**
     * 营地名称
     */
    private String name;

    /**
     * 营地经理
     */
    @Column(name = "manager_user_id")
    private String managerUserId;

    /**
     * 营地电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 营地照片
     */
    private String picture;

    /**
     * 营地描述
     */
    private String describe;

    /**
     * 原价
     */
    private Double price;

    /**
     * 现价
     */
    @Column(name = "present_price")
    private Double presentPrice;

    /**
     * 可预约数
     */
    private Integer number;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取营地详情编号
     *
     * @return camp_info_id - 营地详情编号
     */
    public String getCampInfoId() {
        return campInfoId;
    }

    /**
     * 设置营地详情编号
     *
     * @param campInfoId 营地详情编号
     */
    public void setCampInfoId(String campInfoId) {
        this.campInfoId = campInfoId;
    }

    /**
     * 获取营地名称
     *
     * @return name - 营地名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置营地名称
     *
     * @param name 营地名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取营地经理
     *
     * @return manager_user_id - 营地经理
     */
    public String getManagerUserId() {
        return managerUserId;
    }

    /**
     * 设置营地经理
     *
     * @param managerUserId 营地经理
     */
    public void setManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
    }

    /**
     * 获取营地电话
     *
     * @return phone - 营地电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置营地电话
     *
     * @param phone 营地电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取营地照片
     *
     * @return picture - 营地照片
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置营地照片
     *
     * @param picture 营地照片
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取营地描述
     *
     * @return describe - 营地描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置营地描述
     *
     * @param describe 营地描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 获取原价
     *
     * @return price - 原价
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置原价
     *
     * @param price 原价
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取现价
     *
     * @return present_price - 现价
     */
    public Double getPresentPrice() {
        return presentPrice;
    }

    /**
     * 设置现价
     *
     * @param presentPrice 现价
     */
    public void setPresentPrice(Double presentPrice) {
        this.presentPrice = presentPrice;
    }

    /**
     * 获取可预约数
     *
     * @return number - 可预约数
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置可预约数
     *
     * @param number 可预约数
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
}