package com.bookstore.mapper;

import com.bookstore.pojo.OrderForm;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface OrderFormMapper {
    /*
    * 根据user_id获取订单信息
     * @param user_id
     * @return
     * */

    List<OrderForm> selectByUserId(int user_id);
}
