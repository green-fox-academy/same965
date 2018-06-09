package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankServiceImpl implements BankService {

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    @Override
    public void add(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public ArrayList<BankAccount> getAccounts() {
        return bankAccounts;
    }

    @Override
    public void createNewAccount() {
        bankAccounts.add(new BankAccount("Simba", 2000.0, "lion", true, true));
        bankAccounts.add(new BankAccount("Pumbaa", 200.0,"warthog", true, false));
        bankAccounts.add(new BankAccount("Scar", 1500.0, "lion", false, false));
        bankAccounts.add(new BankAccount("Zazu", 100.0, "red-billed hornbill", true, false));
        bankAccounts.add(new BankAccount("Shenzi", 120.0, "hyena", false, false));
    }

}
