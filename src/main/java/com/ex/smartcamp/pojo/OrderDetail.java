package com.ex.smartcamp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "order_detail")
public class OrderDetail {
    @Id
    private String id;

    /**
     * 订单编号
     */
    @Column(name = "order_base_id")
    private String orderBaseId;

    /**
     * 营地编号
     */
    @Column(name = "camp_id")
    private String campId;

    /**
     * 购买数量
     */
    @Column(name = "buy_num")
    private Integer buyNum;

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
     * 获取订单编号
     *
     * @return order_base_id - 订单编号
     */
    public String getOrderBaseId() {
        return orderBaseId;
    }

    /**
     * 设置订单编号
     *
     * @param orderBaseId 订单编号
     */
    public void setOrderBaseId(String orderBaseId) {
        this.orderBaseId = orderBaseId;
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
     * 获取购买数量
     *
     * @return buy_num - 购买数量
     */
    public Integer getBuyNum() {
        return buyNum;
    }

    /**
     * 设置购买数量
     *
     * @param buyNum 购买数量
     */
    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }
}