package com.bookstore.pojo;

import java.util.Date;

/**
 * 类 名 称：OrderForm
 * 类 描 述：订单表实体类
 * 创建时间：2019/9/7 14:41
 * 创建人：Mical
 */
public class OrderForm {
    private int orderId;
    private BookUser bookUser;
    private String receiverName;
    private String receiverTelephone;
    private String receiverAddress;
    private Double allCost;
    private Integer allNumber;
    private Date orderCreateTime;

    public BookUser getBookUser() {
        return bookUser;
    }

    public void setBookUser(BookUser bookUser) {
        this.bookUser = bookUser;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverTelephone() {
        return receiverTelephone;
    }

    public void setReceiverTelephone(String receiverTelephone) {
        this.receiverTelephone = receiverTelephone;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public Double getAllCost() {
        return allCost;
    }

    public void setAllCost(Double allCost) {
        this.allCost = allCost;
    }

    public Integer getAllNumber() {
        return allNumber;
    }

    public void setAllNumber(Integer allNumber) {
        this.allNumber = allNumber;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }
}
