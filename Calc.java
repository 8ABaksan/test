package com.murat;
//ПРроверка
import java.util.Scanner;
public class Calc {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
    System.out.println( ANSI_PURPLE + "Введите число: " + ANSI_RESET );
    Scanner num1 = new Scanner(System.in);
    float fir = num1.nextFloat();
    System.out.println( ANSI_RED + "Введите действие(+,-,*,/): " + ANSI_RESET);
    Scanner opti = new Scanner(System.in);
    String opt = opti.nextLine();
        System.out.println( ANSI_CYAN + "Введите число: " + ANSI_RESET );
        Scanner num2 = new Scanner(System.in);
        float sec = num2.nextFloat();
        switch (opt) {
            case "/":
                if (sec != 0)
                    System.out.println(fir / sec);
                break;
            case "+":
                System.out.println(fir + sec);
                break;
            case "-":
                System.out.println(fir - sec);
                break;

            case "*":
                System.out.println(fir * sec);
                break;
            default:
                System.out.println("Неправильное действие!");

        }



    }
}

