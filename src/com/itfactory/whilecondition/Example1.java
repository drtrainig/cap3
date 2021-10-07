package com.itfactory.whilecondition;

import java.util.Scanner;

public class Example1
{
    /**
     * Sa se citeasca de la tastatura numere pana la introducerea numarului 0.
     * Se cere sa se foloseasca bucla while.
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Introdu numarul: ");
        //Pot sa am acest caz in care fac o atribuire in interiorul parantezelor buclei while.
        //Atentie: Am facut o atribuire, dar in final  tot verific conditia sa fie diferit de 0 deoarece in while trebuie sa fie tot timpul conditia "Pana cand stau in bucla"
        //Citesc numarul x care trebuie sa fie diferit de 0. In momentul in care citesc 0, ies din program.
        while( (x = scanner.nextInt()) != 0 ) {
            System.out.println("Am citit: " + x);
            System.out.print("Introdu numarul: ");
        }
        System.out.println("S-a introdus numarul 0. Ies din bucla");
    }
}
