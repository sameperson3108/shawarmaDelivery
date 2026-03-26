package com.sameperson3108.shawarmadelivery.domain.model;

import lombok.Data;

@Data // автоматически проставлены геттеры и сеттеры
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String telegram;
    private String address;

}
