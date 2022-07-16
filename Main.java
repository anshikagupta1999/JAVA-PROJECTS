package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("code for ROCK is 0");
        System.out.println("code for SCISSOR is 1");
        System.out.println("code for PAPER is 2");
        System.out.println("choose any one number!");
        Random r=new Random();
        int i = r.nextInt(3);
        int a=sc.nextInt();
       if(a==0 && i==1)
       {
           System.out.println("you won!");
       }
       else if(a==2 &&i==0)
       {
           System.out.println("you won!");
       }
       else if(a==1 && i==2)
       {
           System.out.println("you won!");
       }
        else if(a==1 && i==0)
        {
            System.out.println("you loose!");
        }
        else if(a==0 &&i==2)
        {
            System.out.println("you loose!");
        }
        else if(a==2 && i==1)
        {
            System.out.println("you loose!");
        }

    }
}
