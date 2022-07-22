package com.itheima.domain;

public class User {
    private Integer id;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
