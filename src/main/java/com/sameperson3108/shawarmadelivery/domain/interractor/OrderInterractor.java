package com.sameperson3108.shawarmadelivery.domain.interractor;

import com.sameperson3108.shawarmadelivery.domain.model.Order;
import com.sameperson3108.shawarmadelivery.domain.model.OrderStatus;
import com.sameperson3108.shawarmadelivery.domain.model.User;
import com.sameperson3108.shawarmadelivery.domain.repo.OrderRepo;

import java.util.List;

public class OrderInterractor {
    private final OrderRepo repo;

    public OrderInterractor(OrderRepo repo) {
        this.repo = repo;
    }

    public Order createOrder(Order order) {
        return repo.saveOrder(order);
    }

    public Order changeOrder(Order order) {
        return repo.updateOrder(order);
    }

    public List<Order> getOrders(User user) {
        return repo.getOrdersByUser(user);
    }

    public List<Order> getOrdersByStatus(OrderStatus status) {
        return repo.getOrdersByStatus(status);
    }

}
