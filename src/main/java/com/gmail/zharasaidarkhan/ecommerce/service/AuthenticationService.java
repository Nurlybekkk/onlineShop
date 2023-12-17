package com.gmail.zharasaidarkhan.ecommerce.service;

import com.gmail.zharasaidarkhan.ecommerce.dto.request.PasswordResetRequest;
import com.gmail.zharasaidarkhan.ecommerce.dto.response.MessageResponse;

public interface AuthenticationService {

    MessageResponse sendPasswordResetCode(String email);

    String getEmailByPasswordResetCode(String code);

    MessageResponse resetPassword(PasswordResetRequest request);
}
