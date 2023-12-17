package com.gmail.zharasaidarkhan.ecommerce.service;

import com.gmail.zharasaidarkhan.ecommerce.domain.Order;
import com.gmail.zharasaidarkhan.ecommerce.domain.User;
import com.gmail.zharasaidarkhan.ecommerce.dto.request.ChangePasswordRequest;
import com.gmail.zharasaidarkhan.ecommerce.dto.request.EditUserRequest;
import com.gmail.zharasaidarkhan.ecommerce.dto.request.SearchRequest;
import com.gmail.zharasaidarkhan.ecommerce.dto.response.MessageResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User getAuthenticatedUser();

    Page<Order> searchUserOrders(SearchRequest request, Pageable pageable);

    MessageResponse editUserInfo(EditUserRequest request);

    MessageResponse changePassword(ChangePasswordRequest request);
}
