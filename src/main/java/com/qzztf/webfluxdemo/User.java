package com.qzztf.webfluxdemo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author qzz
 */
@Data
@Document
public class User {
    @Id
    private String id;
    private String username = "qqq";
    private String phone;
    private String email;
    private String name;
    private Date birthday;
}