package com.bookstore.pojo;

/**
 * 类 名 称：OrderDetails
 * 类 描 述：订单详情表实体类
 * 创建时间：2019/9/7 14:50
 * 创建人：Mical
 */
public class OrderDetails {
    private Integer id;
    private Integer orderId;
    private BookInfo bookInfo;
    private Integer bookNumber;
    private Double bookPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public Integer getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }


    @Override
    public String toString() {
        return "order_details{" +
                "id=" + id +
                ", order_id='" + orderId + '\'' +
                ", book_id=" +bookInfo.getId() +
                ", book_number=" + bookNumber +
                ", book_price " + bookPrice +
                '}';
    }
}
