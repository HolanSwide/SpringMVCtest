package com.holanswide.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/21 22:39
 */

@Component
public class User {
    @Value(value = "0")
    private int uid;
    @Value(value = "Rei")
    private String username;
    @Value(value = "777")
    private String password;

    @Override
    public String toString() {
        return String.valueOf(this.uid) + " "
                + this.username + " "
                + this.password;
    }

    public User() {
    }

    public User(int uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
