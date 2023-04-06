package com.company.CWH;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class CWH_conditionals {
    public static void main(String[] args)
    {
//        int age=19;
//        boolean condition=(age>18);
//        if(condition)
//        {
//            System.out.println("can drive");
//        }
//        else {
//            System.out.println("cant drive");
//        }
        // comp 1 means scissor
        //comp 2 means paper
        //comp 3 means stone
          Random rand=new Random();
          int comp=rand.nextInt(1,4);
          Scanner sc=new Scanner(System.in);
          String user=sc.nextLine();
          if(comp==1 && Objects.equals(user, "scissor"))
          {
              System.out.println("tie");
          }
          else if(comp==1 && Objects.equals(user, "paper"))
          {
            System.out.println("you loose");
          }
          else if(comp==1 && Objects.equals(user, "stone"))
          {
              System.out.println("you win");
          }
        else if(comp==2 && Objects.equals(user, "scissor"))
        {
            System.out.println("you win");
        }
        else if(comp==2 && Objects.equals(user, "paper"))
        {
            System.out.println("tie");
        }
        else if(comp==2 && Objects.equals(user, "stone"))
        {
            System.out.println("you loose");
        }
          else if(comp==3 && Objects.equals(user, "scissor"))
          {
              System.out.println("you loose");
          }
          else if(comp==3 && Objects.equals(user, "paper"))
          {
              System.out.println("you win");
          }
          else if(comp==3 && Objects.equals(user, "stone"))
          {
              System.out.println("tie");
          }
        System.out.println(comp);

    }
}
