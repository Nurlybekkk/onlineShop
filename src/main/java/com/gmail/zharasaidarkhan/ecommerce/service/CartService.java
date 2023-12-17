package com.gmail.zharasaidarkhan.ecommerce.service;

import com.gmail.zharasaidarkhan.ecommerce.domain.Perfume;

import java.util.List;

public interface CartService {

    List<Perfume> getPerfumesInCart();

    void addPerfumeToCart(Long perfumeId);

    void removePerfumeFromCart(Long perfumeId);
}
