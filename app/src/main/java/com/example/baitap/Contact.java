package com.example.baitap;

public class Contact {
    private String name;
    private String idStudent;

    public Contact(String name, String idStudent){
        this.name = name;
        this.idStudent = idStudent;
    }

    public String getName(){
        return name;
    }
    public String getIdStudent() {
        return idStudent;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }
}
