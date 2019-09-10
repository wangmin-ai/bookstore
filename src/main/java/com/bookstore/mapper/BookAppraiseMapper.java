package com.bookstore.mapper;

import com.bookstore.pojo.BookAppraise;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookAppraiseMapper {
    /*
    * 根据评价id查看评论具体信息
    * @param id
    * @return
    * */
    List<BookAppraise> selectBayid(Integer id);

    /*
    *删除评论
    */
    int deleteByPrimaryKey(Integer id);

    /*
    * 添加评论
    * */
    int insertContent(BookAppraise talk_content);



}
