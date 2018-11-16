package com.company;

public class Main {

    public static int[] thisarray = new int[10];

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
        {
            thisarray[i] = (int)(Math.random()*10);
        }
        returnarr();
        DWongLib.selection(thisarray, "asc");
        returnarr();
    }

    public static void returnarr()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.print(thisarray[i]);
        }
        System.out.println(".");
    }
}