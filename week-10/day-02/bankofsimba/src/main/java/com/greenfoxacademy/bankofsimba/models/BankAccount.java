package com.greenfoxacademy.bankofsimba.models;

import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private Boolean isGood;
    private Boolean isKing;

    public BankAccount() {
    }

    public BankAccount(String name, Double balance, String animalType, Boolean isGood, Boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isGood = isGood;
        this.isKing = isKing;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Boolean getKing() {
        return isKing;
    }

    public Boolean getGood() {
        return isGood;
    }

    public void setKing(Boolean king) {
        isKing = king;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
