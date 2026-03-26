package com.sameperson3108.shawarmadelivery.domain.interractor;

import com.sameperson3108.shawarmadelivery.domain.model.Delivery;
import com.sameperson3108.shawarmadelivery.domain.repo.DeliveryRepo;

public class DeliveryInterractor {
    private final DeliveryRepo repo;

    public DeliveryInterractor(DeliveryRepo repo) {
        this.repo = repo;
    }

    public Delivery createDelivery(Delivery delivery) {
        return repo.saveDelivery(delivery);
    }

    public Delivery updateDelivery(Delivery delivery) {
        return repo.updateDelivery(delivery);
    }

    public Delivery getDeliveryById(Long id) {
        return repo.getDeliveryById(id);
    }
}
