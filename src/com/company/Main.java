package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        if (num % 1 == 0) {
            System.out.println("ЦЕЛОЕ");
        }
        else {
            System.out.println("ВЕЩЕСТВЕННОЕ");
        }
        // крутой комментарий
    }
}