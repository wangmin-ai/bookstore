package com.bookstore.pojo;

/**
 * 类 名 称：BookCat
 * 类 描 述：TODO
 * 创建时间：2019/9/7 9:24
 * 创建人：Mical
 */
public class BookCat {
    private int id;
    private String name;
    private int parentId;
    private int isParent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getIsParent() {
        return isParent;
    }

    public void setIsParent(int isParent) {
        this.isParent = isParent;
    }

    @Override
    public String toString() {
        return "BookCat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", isParent=" + isParent +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BookCat){
            BookCat bookCat = (BookCat) obj;
            return bookCat.getName().equals(this.getName());
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
}
