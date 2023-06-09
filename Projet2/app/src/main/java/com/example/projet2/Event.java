package com.example.projet2;

import java.io.Serializable;


public class Event implements Serializable {
    private String title;
    private String date;
    private String time;
    private int coefficient;
    private String type;
    private Subject subject;

    public Event(String title, String date, String time, int coefficient, String type, Subject subject) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.coefficient = coefficient;
        this.type = type;
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String toString(){
        return String.format("Event: %s, Date: %s, Time: %s, Coefficient: %d, Type: %s",
                this.getTitle(), this.getDate(), this.getTime(), this.getCoefficient(), this.getType());
    }
}