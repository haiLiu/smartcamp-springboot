package com.ex.smartcamp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_base")
public class OrderBase {
    /**
     * 订单id
     */
    @Id
    private String id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 订单金额
     */
    private Double amount;

    /**
     * 订单状态
     */
    private Byte status;

    /**
     * 下单时间
     */
    @Column(name = "order_data")
    private Date orderData;

    /**
     * 获取订单id
     *
     * @return id - 订单id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置订单id
     *
     * @param id 订单id
     */
    public void setId(String id) {
        this.id = id;
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
     * 获取订单金额
     *
     * @return amount - 订单金额
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * 设置订单金额
     *
     * @param amount 订单金额
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 获取订单状态
     *
     * @return status - 订单状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置订单状态
     *
     * @param status 订单状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取下单时间
     *
     * @return order_data - 下单时间
     */
    public Date getOrderData() {
        return orderData;
    }

    /**
     * 设置下单时间
     *
     * @param orderData 下单时间
     */
    public void setOrderData(Date orderData) {
        this.orderData = orderData;
    }
}