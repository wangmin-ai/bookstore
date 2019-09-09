package com.bookstore.service.impl;

import com.bookstore.mapper.BookInfoMapper;
import com.bookstore.pojo.BookInfo;
import com.bookstore.service.BookInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类 名 称：BookInfoServiceImpl
 * 类 描 述：书籍详情相关服务层实现类
 * 创建时间：2019/9/8 13:27
 * 创建人：Mical
 */
@Service
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    /**
     * 根据书籍标识id获取书籍列表
     * @param identifyId 标识id
     * @param count 获取书籍数量
     * @return
     */
    @Override
    public List<BookInfo> getBooksByIndentify(int identifyId, int count) {
        return bookInfoMapper.selectByIdentify(identifyId, count);
    }

    /**
     * 根据分类id查询
     * @param catId 分类id
     * @return
     */
    @Override
    public List<BookInfo> getBooksByCat(int catId) {
        return bookInfoMapper.selectByCatId(catId);
    }

    /**
     * 根据书籍id查询
     * @param id
     * @return
     */
    @Override
    public BookInfo getBookById(int id) {
        return bookInfoMapper.selectByBookId(id);
    }

    /**
     * 随机从数据库中查找数据
     * @return
     */
    @Override
    public List<BookInfo> getRandBooks(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<BookInfo> bookInfos = bookInfoMapper.selectRandBooks();
        return bookInfos;
    }
}
