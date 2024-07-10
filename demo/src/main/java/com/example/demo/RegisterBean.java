package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterBean {
    private String name; //リクエストパラメータ(htmlの$のところ)と合わせる必要がある。
    private String age;
}
