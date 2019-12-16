package com.model;

public class StaticCounter {

    private static int num = 0;
    private String message;


    public StaticCounter(String message) {
        this.message = message;
        num++;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static int getNum() {
        return num;
    }
}
