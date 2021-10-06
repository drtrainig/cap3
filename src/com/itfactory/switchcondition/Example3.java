package com.itfactory.switchcondition;

import java.util.Random;

public class Example3
{
    //Switch fara break va executa totul din momentul in care va gasi valoarea indiferent daca e egal sau nu
    public static void main(String[] args)
    {
        Random random = new Random();
        int x = random.nextInt(3 + 1);

        switch (x)
        {
        case 0:
            System.out.println("Am generat random 0");
            break;
        case 1:
        case 2:
        case 3:
            System.out.println("Am generat random intre 1 si 3");
            break;
        }

        System.out.println(x);
    }
}
