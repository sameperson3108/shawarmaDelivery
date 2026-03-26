package com.sameperson3108.shawarmadelivery.conf;

import com.sameperson3108.shawarmadelivery.data.repoImpls.collectionFrw.UserRepoImpl;
import com.sameperson3108.shawarmadelivery.domain.repo.UserRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShawarmaConfig {

    @Bean
    public UserRepo userRepo() {
        return new UserRepoImpl();
    }
}
