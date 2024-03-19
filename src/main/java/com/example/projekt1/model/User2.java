package com.example.projekt1.model;

public class User2  implements Cloneable {

    private String name;
    private Integer age;
    private String color;
    private String pesel;

    public User2() {
        pesel = generatePesel();
    }

    public User2(String name, Integer age, String color, String pesel) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.pesel = pesel;
    }

    public User2(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    private String  generatePesel() {
        return "2143124235344";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        age = age - 10;

        return super.clone();
    }
}
