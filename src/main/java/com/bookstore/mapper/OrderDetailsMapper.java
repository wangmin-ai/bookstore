package com.bookstore.mapper;

import com.bookstore.pojo.OrderDetails;

import java.util.List;

public interface OrderDetailsMapper {
   /*
   * 根据订单id查询
   * @param id
   * @return
    * */
    List<OrderDetails> selectByid(int id);

}
