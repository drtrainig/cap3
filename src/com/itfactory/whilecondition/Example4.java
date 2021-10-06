package com.itfactory.whilecondition;

import java.util.Random;

public class Example4
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int x = random.nextInt(5 + 1);

        while (true)
        {
           if(x == 3) {
               System.out.println("Numarul generat este intr-adevar 3. Verificare:  " + x);
               break;
           }
           System.out.println("S-a afisat numarul: " + x);
           x = random.nextInt(5 + 1);
        }
    }
}
