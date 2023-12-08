package ru.otus.java.fedotov;

import com.google.common.base.Joiner;

@SuppressWarnings("java:S106")
public class HelloOtus {
    public static void main(String... args) {
        String[] strings = {"I", "just", "wanna", "say", "HI"};
        System.out.println(Joiner.on(" ").join(strings));
    }
}
