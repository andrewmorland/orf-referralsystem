package com.hospital.entity;

import org.springframework.util.DigestUtils;

/**
 * Created by morland on 2016/3/18.
 */
public class User {
    private String username;
    private String password;
    private String hospital;
    private String name;
    private String post;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {

         return DigestUtils.md5DigestAsHex(password.getBytes());

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
