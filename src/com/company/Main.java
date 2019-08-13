package com.company;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Rub: ");
        double rub = input.nextDouble();
        System.out.println("Course: ");
        double course = input.nextDouble();

        double usdFull = rub / course;

        double usd = new BigDecimal(usdFull).setScale(2, RoundingMode.UP).doubleValue();

        System.out.println("USD: " + usd);



    }
}