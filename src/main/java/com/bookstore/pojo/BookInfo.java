package com.bookstore.pojo;

import java.io.Serializable;

/**
 * 类 名 称：BookInfo
 * 类 描 述：TODO
 * 创建时间：2019/9/7 8:49
 * 创建人：Mical
 */
public class BookInfo implements Serializable {
    private int id;
    private String bookName;
    private String bookDesc;
    private Double bookPrice;
    private String bookAuthor;
    private String bookPress;
    private String bookDate;
    private String bookImg;
    private String bookCat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public String getBookCat() {
        return bookCat;
    }

    public void setBookCat(String bookCat) {
        this.bookCat = bookCat;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookDesc='" + bookDesc + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPress='" + bookPress + '\'' +
                ", bookDate='" + bookDate + '\'' +
                ", bookImg='" + bookImg + '\'' +
                ", bookCat='" + bookCat + '\'' +
                '}';
    }
}
