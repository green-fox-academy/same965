package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BankService {
    public void add(BankAccount bankAccount);

    public ArrayList<BankAccount> getAccounts ();

    public void createNewAccount();



}
