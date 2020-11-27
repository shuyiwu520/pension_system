package com.example.demo.entity;

public class Position {
    private double xlocation;
    private double ylocation;

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

    @Override
    public String toString() {
        return "Position{" +
                "xlocation=" + xlocation +
                ", ylocation=" + ylocation +
                '}';
    }
}
