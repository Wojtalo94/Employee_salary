package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wynagrodzenie netto dla swojego pracownika, który ubiega się na stanowisko juniora:");

        int salary = scanner.nextInt();

        if (salary == 3000)
        {
            System.out.println("Myslę że 3000 netto na start to jest ok, ale pod paroma warunkami :) ");
        }
        while (salary < 3000)
        {
            System.out.println("Oj to zdecydowanie za mało :( !!!");
            break;
        }
        while (salary > 3000)
        {
            System.out.println("Zgadzam się na podaną kwotą w 100% :D !!!");
            break;
        }

    }
}