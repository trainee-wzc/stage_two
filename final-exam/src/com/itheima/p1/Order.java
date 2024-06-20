package com.itheima.p1;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private String name;
    private LocalDateTime time;
    private double prize;

    public Order() {
    }

    public Order(int id, String name, LocalDateTime time, double prize) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.prize = prize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", prize=" + prize +
                '}';
    }
}
