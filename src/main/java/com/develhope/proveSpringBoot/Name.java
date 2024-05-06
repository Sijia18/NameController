package com.develhope.proveSpringBoot;

public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static String reverseName(String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
