package com.example.demo;

import java.util.ArrayList;

public class Owners {
    private ArrayList<Account> owners = new ArrayList<>();


    public ArrayList<Account> getOwners() {
        return owners;
    }

    public void setOwners(ArrayList<Account> owners) {
        this.owners = owners;
    }
    public void setOwner(Account account){
        this.owners.add(account);
    }


}
