package com.example.demo.entity;

public class PersonCondition {
    private Integer id;
    private Integer card;
    private String name;
    private String age;
    private String gender;
    private String bloodRoutine;
    private String electrocardiogram;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodRoutine() {
        return bloodRoutine;
    }

    public void setBloodRoutine(String bloodRoutine) {
        this.bloodRoutine = bloodRoutine;
    }

    public String getElectrocardiogram() {
        return electrocardiogram;
    }

    public void setElectrocardiogram(String electrocardiogram) {
        this.electrocardiogram = electrocardiogram;
    }

    @Override
    public String toString() {
        return "PersonCondition{" +
                "id=" + id +
                ", card=" + card +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodRoutine='" + bloodRoutine + '\'' +
                ", electrocardiogram='" + electrocardiogram + '\'' +
                '}';
    }
}
