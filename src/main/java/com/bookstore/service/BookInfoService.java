package com.bookstore.service;

import com.bookstore.pojo.BookInfo;

import java.util.List;

/**
 * 类 名 称：BookInfoService
 * 类 描 述：书籍详情服务层相关接口
 * 创建时间：2019/9/8 13:25
 * 创建人：Mical
 */
public interface BookInfoService {
    List<BookInfo> getBooksByIndentify(int identifyId, int count);
    List<BookInfo> getBooksByCat(int catId);
    BookInfo getBookById(int id);
}
