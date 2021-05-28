package com.zheng.springboot.bootredisdemo.javabean;

import java.io.Serializable;

public class Ceshi implements Serializable {
    final String id="8eeec1d4-0a65-46f2-864c-568c64e0f181";

    private String name;
    private  String old;
    public Ceshi() {

    }

    public Ceshi(String name, String old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    @Override
    public String toString() {
        return "ceshi{" +
                "name='" + name + '\'' +
                ", old='" + old + '\'' +
                '}';
    }
}
