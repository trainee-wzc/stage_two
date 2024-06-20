package com.itheima.p2;

import java.util.List;

public class People {
    private String name;
    private List<String> location;

    public People() {
    }

    public People(String name, List<String> location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLocation() {
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
