package com.bookstore.mapper;

import com.bookstore.pojo.BookInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类 名 称：BookInfoMapper
 * 类 描 述：书籍详情的相关操作
 * 创建时间：2019/9/7 8:53
 * 创建人：Mical
 */
public interface BookInfoMapper {

    /**
     * 根据书籍名称进行模糊查询
     * @param bookName
     * @return
     */
    List<BookInfo> selectByBookName(String bookName);

    /**
     * 根据书籍id查询书籍详情
     * @return
     */
    BookInfo selectByBookId(int id);
}
