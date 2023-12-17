package com.gmail.zharasaidarkhan.ecommerce.service;

import com.gmail.zharasaidarkhan.ecommerce.domain.Order;
import com.gmail.zharasaidarkhan.ecommerce.domain.Perfume;
import com.gmail.zharasaidarkhan.ecommerce.domain.User;
import com.gmail.zharasaidarkhan.ecommerce.dto.request.OrderRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {

    Order getOrder(Long orderId);

    List<Perfume> getOrdering();

    Page<Order> getUserOrdersList(Pageable pageable);

    Long postOrder(User user, OrderRequest orderRequest);
}
