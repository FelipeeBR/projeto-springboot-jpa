package com.projetoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.course.entities.OrderItem;
import com.projetoweb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
