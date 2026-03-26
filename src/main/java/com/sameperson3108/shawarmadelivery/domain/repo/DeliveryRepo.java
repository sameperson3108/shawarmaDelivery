package com.sameperson3108.shawarmadelivery.domain.repo;

import com.sameperson3108.shawarmadelivery.domain.model.Delivery;

public interface DeliveryRepo {
    Delivery saveDelivery(Delivery delivery);
    Delivery updateDelivery(Delivery delivery);
    Delivery getDeliveryById(Long id);
}
