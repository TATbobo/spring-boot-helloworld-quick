package com.dreamtucker.springboothelloworldquick.Pojo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString
public class Dog {
    private String name;
    private Integer age;
}
