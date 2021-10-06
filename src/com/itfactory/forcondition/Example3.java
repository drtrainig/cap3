package com.itfactory.forcondition;

import java.util.Random;

public class Example3
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int limitaInferioara = 0;
        int limitaSuperioara = 15;

        for(int i = limitaInferioara; i < limitaSuperioara; i++)
        {
            int x = random.nextInt(limitaSuperioara + 1);
            if (i == x)
            {
                System.out.println("S-a facut un match: " + i + " : " + x);
            }
        }
    }
}
