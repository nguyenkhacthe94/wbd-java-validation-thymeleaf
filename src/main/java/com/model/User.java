package com.model;

import javax.validation.constraints.*;

public class User {
    @NotEmpty (message = "Quá ngắn hoặc quá dài")
    @Size(min = 2, max = 30)
    private String name;

    @NotNull (message = "age must be greater than or equal 18")
    @Min(18)
    public int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
