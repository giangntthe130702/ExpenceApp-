package com.company;

public class Entity {
    private int id;
    private String content;
    private String date;
    private double amount;

    public Entity() {
    }

    public Entity(int id, String content, String date, double amount) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString(){
        String display = String.format("%d%20s%20.0f%20s", id, date, amount, content);
        return display;
    }
}
