package com.itfactory.whilecondition;

import java.util.Random;

public class Example4
{
    /**
     * Se cere sa se creeze o bucla while prin care se genereaza cate un numar randon intre 1 si 10 la fiecare iteratie.
     * In momentul in care s-a generat 5 se va iesi din bucla.
     * @param args
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        int x = random.nextInt(10 + 1);

        while (true)
        {
           if(x == 5) {
               System.out.println("Numarul generat este intr-adevar 5. Verificare:  " + x);
               break;
           }
           System.out.println("S-a generat numarul: " + x);
           x = random.nextInt(10 + 1);
        }
    }
}
