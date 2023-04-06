package com.company.CWH;

public class CWH_methods {
    static void change(int[] marks)
    {
        marks[0]=87;
    }
    static void change()
    {
        System.out.println("Bring a change in youself!");
    }
    static int sum(int ...array)
    {   //var args take all the args and puts it in array 'array'
        int add=0;
        for(int num:array)
        {
            add=add+num;
        }
        return add;
    }
    static int factorial(int n)
    {   if(n==1)
           {return 1;}
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args)
    {
        /* Sometimes our program is too big in size so to separate a repeating logic from the program we make use of methods
        DRY method---> Do Not Repeat yourself method
         */
        /*static method can only call static method. Static means that a function is available to all the obj of class.
         i.e. it is a common function
         */
        int[] arr={22,32,45,12};
        change(arr);
        System.out.println(arr[0]);
        change();
        //here the value will change because arr array is giving reference/address of the array obj .
        // So value at that address is getting updated
        int x=sum(8,9,7,0);
        System.out.println("var args used "+x);
        int y=factorial(5);
        System.out.println("doing factorial using recursion method"+ y);
    }

    //METHOD OVERLOADING WALA PART

}


