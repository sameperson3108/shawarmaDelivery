package com.sameperson3108.shawarmadelivery.presentation.service;

import com.sameperson3108.shawarmadelivery.domain.interractor.UserInterractor;
import com.sameperson3108.shawarmadelivery.domain.repo.UserRepo;

public class UserService extends UserInterractor {
    public UserService(UserRepo userRepo) {
        super(userRepo);
    }
}
