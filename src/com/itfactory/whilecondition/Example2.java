package com.itfactory.whilecondition;

import java.util.Random;

public class Example2
{
    /**
     * Se se genereze numere intr-o bucla, intre 0 si 100 pana cand numarul este mai mic decat 50
     * @param args
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        int x = random.nextInt(100 + 1);

        while (x > 50)
        {
            System.out.println("Numarul " + x + " este mai mare decat 50");
            x = random.nextInt(100 + 1);
        }

        System.out.println("Numarul " + x + " nu este mai mare decat 50");
    }
}
