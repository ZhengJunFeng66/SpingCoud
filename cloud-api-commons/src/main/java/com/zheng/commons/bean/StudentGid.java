package com.zheng.commons.bean;

public class StudentGid {
    long id;
    String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentGid{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
