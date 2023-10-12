package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.time.LocalTime;

public class Visitor implements Serializable {
    String fio;
    String age;
    String time;
    String email;

    public String toString() {
        return "ФИО: " + this.fio + ";\n" +
                "Возраст: " + this.age + ";\n" +
                "Время прибытия: " + this.time + ";\n" +
                "Электронная почта: " + this.email + ".\n";
    }

    public String getFio() {
        return this.fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
