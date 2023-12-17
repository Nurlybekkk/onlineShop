package com.gmail.zharasaidarkhan.ecommerce.service;

import com.gmail.zharasaidarkhan.ecommerce.dto.response.MessageResponse;
import com.gmail.zharasaidarkhan.ecommerce.dto.request.UserRequest;

public interface RegistrationService {

    MessageResponse registration(String captchaResponse, UserRequest user);

    MessageResponse activateEmailCode(String code);
}
