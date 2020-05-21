package com.example.demo;

public class Account {
    private String personName;
    private String phone;
    private String petInfo;
    private String petName;
    private String age;
    private String gender;
    private String petType;
    private String breed;

    public Account(String personName, String phone, String petInfo, String petName, String age, String gender, String petType, String breed) {
        this.personName = personName;
        this.phone = phone;
        this.petInfo = petInfo;
        this.petName = petName;
        this.age = age;
        this.gender = gender;
        this.petType = petType;
        this.breed = breed;
    }

    public Account() {

    }


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPetInfo() {
        return petInfo;
    }

    public void setPetInfo(String petInfo) {
        this.petInfo = petInfo;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
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

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

