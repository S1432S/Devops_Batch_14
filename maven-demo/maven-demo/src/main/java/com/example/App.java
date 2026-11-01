package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {

        String message = "maven assignment";

        System.out.println("Original message: " + message);

        System.out.println("Capitalized message: " + StringUtils.capitalize(message));

        System.out.println("Reversed message: " + StringUtils.reverse(message));
    }
}
