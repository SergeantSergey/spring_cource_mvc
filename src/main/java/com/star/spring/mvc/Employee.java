package com.star.spring.mvc;

import com.star.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "Name mas be min 2 symbols")
    private String name;

    @NotEmpty(message = "surname is required field")
    private String surname;

    @Min(value = 500,message = "min value 500")
    @Max(value = 1000, message = "max value 1000")
    private int salary;

    private String department;

    private Map<String, String> departments;

    private Map<String, String> carBrands;

    private String[] languages;

    private Map<String,String> languageList;

    private String carBrand;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please user patten XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "abc.com", message = "Email mast end with abc.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Research", "HR");
        departments.put("Sales", "Sale");

        carBrands = new HashMap<>();
        carBrands.put("Audi", "Audi");
        carBrands.put("BMW", "BMW");
        carBrands.put("MB", "Mercedes-Benz");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Russian", "RU");
        languageList.put("Franchise", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
