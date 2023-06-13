package com.example.learnthymeleaf;

public class MyBeanClass {

    private String name;
    private boolean isAdmin;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    @Override
    public String toString() {
        return "MyBeanClass [name=" + name + ", isAdmin=" + isAdmin + "]";
    }

    
}
