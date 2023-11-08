package com.example.myapplication;

import java.io.Serializable;
import java.util.Calendar;

public class Visitor implements Serializable {
    String name;
    String surname;
    Integer height;
    Integer weight;
    Integer birthYear;

    public String getAllInfo() {
        return "Имя: " + this.name + ";\n" +
                "Фамилия: " + this.surname + ";\n" +
                "Рост: " + this.height + ";\n" +
                "Вес: " + this.weight + ";\n" +
                "Год рождения: " + this.birthYear + ".\n";
    }

    public String getAgeInfo() {
        return "Имя: " + this.name + ";\n" +
                "Фамилия: " + this.surname + ";\n" +
                "Возраст: " + getAge() + ".\n";
    }

    public String getWeightInfo() {
        return "Имя: " + this.name + ";\n" +
                "Фамилия: " + this.surname + ";\n" +
                "Вес: " + this.getWeight() + ".\n";
    }

    public Integer getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
    }

//    public String toString() {
//        return "Имя: " + this.name + ";\n" +
//                "Фамилия: " + this.surname + ";\n" +
//                "Рост: " + this.height + ";\n" +
//                "Вес: " + this.weight + ";\n" +
//                "Год рождения: " + this.birthYear + ".\n";
//    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }
}
