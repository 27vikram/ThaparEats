package com.example.lenovopc.thapareats.Model;

import java.util.List;

public class Request {
    private String name;
    private String phone;
    private String hostel;
    private String total;
    private String status;
    private String comment;
    private List<Order> foods;
    private String restaurantId;

    public Request() {
    }

    public Request(String name, String phone, String hostel, String total, String status, String comment, List<Order> foods, String restaurantId) {
        this.name = name;
        this.phone = phone;
        this.hostel = hostel;
        this.total = total;
        this.status = status;
        this.comment = comment;
        this.foods = foods;
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
}
