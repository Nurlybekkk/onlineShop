package com.gmail.zharasaidarkhan.ecommerce.dto.response;

import com.gmail.zharasaidarkhan.ecommerce.domain.Order;
import com.gmail.zharasaidarkhan.ecommerce.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.domain.Page;

@Data
@AllArgsConstructor
public class UserInfoResponse {
    private User user;
    private Page<Order> orders;
}
