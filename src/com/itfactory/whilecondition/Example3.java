package com.itfactory.whilecondition;


public class Example3
{
    public static void main(String[] args)
    {
        int x = 1;

        while (x < 5)
        {
            System.out.println("Numarul " + x + " este mai mic decat 5");
            x = x + 1; //x++, x += 1;
        }
        System.out.println("Numarul la final: " + x);
    }
}
