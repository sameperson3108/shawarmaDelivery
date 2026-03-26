package com.sameperson3108.shawarmadelivery.domain.repo;

import com.sameperson3108.shawarmadelivery.domain.model.Order;
import com.sameperson3108.shawarmadelivery.domain.model.OrderStatus;
import com.sameperson3108.shawarmadelivery.domain.model.User;

import java.util.List;

public interface OrderRepo {
    Order saveOrder(Order order);
    Order updateOrder(Order order);
    List<Order> getOrdersByUser(User user);
    List<Order> getOrdersByStatus(OrderStatus orderStatus);
}
