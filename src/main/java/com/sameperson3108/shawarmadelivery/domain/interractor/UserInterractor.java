package com.sameperson3108.shawarmadelivery.domain.interractor;

import com.sameperson3108.shawarmadelivery.domain.model.User;
import com.sameperson3108.shawarmadelivery.domain.repo.UserRepo;

public class UserInterractor {

    private final UserRepo repo;

    public UserInterractor(UserRepo userRepo) {
        this.repo = userRepo;
    }

    public User saveUser(User user) {
        return repo.saveUser(user);
    }

    public void deleteUser(User user) {
        repo.deleteUser(user);
    }

    public User getUserByEmail(String email) {
        return repo.getUserByEmail(email);
    }

    public User updateUser(User user) {
        return repo.updateUser(user);
    }

}
