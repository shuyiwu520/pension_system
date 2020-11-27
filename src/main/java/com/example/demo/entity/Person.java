package com.example.demo.entity;

import java.util.Arrays;

public class Person {
    private int id;
    private String name;
    private String age;
    private int card;
    private String genrel;
    private int room;
    private int dangerous;
    private double xlocation;
    private double ylocation;
    private double[]  position;


    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public double getXlocation() {
        return xlocation;
    }

    public void setXlocation(double xlocation) {
        this.xlocation = xlocation;
    }

    public double getYlocation() {
        return ylocation;
    }

    public void setYlocation(double ylocation) {
        this.ylocation = ylocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGenrel() {
        return genrel;
    }

    public void setGenrel(String genrel) {
        this.genrel = genrel;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getDangerous() {
        return dangerous;
    }

    public void setDangerous(int dangerous) {
        this.dangerous = dangerous;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", card=" + card +
                ", age='" + age + '\'' +
                ", genrel='" + genrel + '\'' +
                ", room=" + room +
                ", dangerous=" + dangerous +
                ", xlocation=" + xlocation +
                ", ylocation=" + ylocation +
                ", position=" + Arrays.toString(position) +
                '}';
    }
}
