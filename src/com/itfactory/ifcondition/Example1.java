package com.itfactory.ifcondition;

import java.util.Scanner;

public class Example1
{
    /**
     * Se citeste un numar de la tastatura. Sa se afiseze un mesaj afirmativ daca numarul este mai mare ca 10
     * In caz contrar se va afisa un mesaj negativ.
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int x = scanner.nextInt();

        if(x > 10) {
            System.out.println("Aceasta conditie este indeplinita");
        } else {
            System.out.println("Aceasta conditie nu este indeplinita");
        }
    }
}
