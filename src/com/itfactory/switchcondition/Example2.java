package com.itfactory.switchcondition;

import java.util.Random;

public class Example2
{
    /**
     * Sa se genereze un numar int random intre 0 si 4
     * Sa se creeze un statement switch prin care se verifica numarul generat.
     * In cazul in care s-a generat 0 o sa afisez un mesaj "Nu am nicio bomboana"
     * In cazul in care s-a generat 1 o sa afisez un mesaj "Am o bomboana"
     * In cazul in care s-a generat 2,3 sau 4 sa se afisze mesajul "Am  o bomboane"
     * @param args
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        int x = random.nextInt(4 + 1);

        switch (x)
        {

        }

        //Pentru verificare puteti afisa numarul generat.
        System.out.println(x);
    }
}
