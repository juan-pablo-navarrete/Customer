package org.example.entity;

public class CustomerEntity {
    private String dni;
    private String name;
    private String phone;
    private String email;
    private int age;

    public CustomerEntity() {
    }

    public CustomerEntity(String dni, String name, String phone, String email, int age) {
        this.dni = dni;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
