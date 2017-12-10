package com.cs449.modal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class User extends AppCompatActivity {

    private int id;
    private String name;
    private String email;
    private String password;
    private float food;
    private float entertainment;
    private float transportation;
    private float clothes;
    private float education;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getFood() { return food; }

    public void setFood(float food) { this.food = food; }

    public float getEntertainment() { return entertainment; }

    public void setEntertainment(float entertainment) { this.entertainment = entertainment; }

    public float getTransportation() { return transportation; }

    public void setTransportation(float transportation) { this.transportation = transportation; }

    public float getClothes() { return clothes; }

    public void setClothes(float clothes) { this.clothes = clothes; }

    public float getEducation() { return education; }

    public void setEducation(float education) { this.education = education; }
}
