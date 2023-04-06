package com.company.CWH;

public class CWH_Arrays {
    public static void main(String[] args)
    {
        //array is used to store data of same type using only 1 variable!
        //reduces the number of lines in a code
        //array stores the reference of object eg. arr will be storing address of array obj
        //ways to create array:-
        //1- int[] arr=new int[5]; ----> declaration n memory allocation
        /*2- int[] arr;    ------>declaration n then memory allocation
           arr=new int[5];
        */
        //3-int [] arr={56,77,98,01}; ----->declaration, mem allocation, initialisation
        int[] arr=new int[5];
        arr[0]=9;
        arr[1]=91;
        arr[2]=92;
        arr[3]=93;
        arr[4]=94;
        System.out.println(arr.length);
        float[] arr1={11.1f,22.2f,66.6f};
        String[] arr2={"ansh","preeti","prabha"};
        System.out.println(arr2.length);
        System.out.println(arr2[1]);
        for (String name:arr2)
        {
            System.out.println("Hi "+name+"!");
        }
        CWH_Arrays a=new CWH_Arrays();
        a.multiarr();
    }
    //multidimensional array are array of array
    void multiarr()
    {
       int arr[][]={{1,2,3},{0,1,2},{5,6,7,8}} ;
        System.out.println(arr[2][2]);
    }
}
