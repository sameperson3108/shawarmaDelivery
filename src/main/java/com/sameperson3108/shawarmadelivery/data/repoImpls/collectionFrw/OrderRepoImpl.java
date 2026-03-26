package com.sameperson3108.shawarmadelivery.data.repoImpls.collectionFrw;

import com.sameperson3108.shawarmadelivery.domain.model.Order;
import com.sameperson3108.shawarmadelivery.domain.model.OrderStatus;
import com.sameperson3108.shawarmadelivery.domain.model.User;
import com.sameperson3108.shawarmadelivery.domain.repo.OrderRepo;

import java.util.ArrayList;
import java.util.List;

public class OrderRepoImpl implements OrderRepo {

    private final List<Order> orders = new ArrayList<Order>();

    @Override
    public Order saveOrder(Order order) {
        orders.add(order);
        return order;
    }

    @Override
    public Order updateOrder(Order order) {
        int index = orders.indexOf(order);
        if (index != -1) orders.set(index, order);
        return order;
    }

    @Override
    public List<Order> getOrdersByUser(User user) {
        return orders.stream()
                .filter(order -> order.getUser().getId().equals(user.getId()))
                .toList();
    }

    @Override
    public List<Order> getOrdersByStatus(OrderStatus orderStatus) {
        return orders.stream()
                .filter((order -> order.getStatus().name().equals(orderStatus.name())))
                .toList();
    }
}
