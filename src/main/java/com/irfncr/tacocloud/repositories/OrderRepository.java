package com.irfncr.tacocloud.repositories;

import com.irfncr.tacocloud.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<Order, Long> {
}
