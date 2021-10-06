package com.itfactory.ifcondition;

import java.util.Random;

public class Example2
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomInt = random.nextInt(100);

        if (randomInt > 50) {
            System.out.println("Numarul generat " + randomInt + " este mai mare decat 50");
        } else {
            System.out.println("Numarul generat " + randomInt + " este mai mic decat 50");
        }
    }

}
