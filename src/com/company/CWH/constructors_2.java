package com.company.CWH;
//super keyword is used as a reference to invoke an obj, method , var of super class or immediate parent class
//super keyword can also be used to invoke a parent class constructor
class Base1
{

    public Base1(int i, String nm) {

    }
    public Base1() {
        System.out.println("inside base constructor");
    }
    public Base1(int a) {
        System.out.println("inside base constructor with value of a as:"+a);
    }

}
class Derived1 extends Base1 //java does not support multiple inheritance
{
    public Derived1()
    {
        System.out.println("derived class constructor");
    }
    public Derived1(int a, int b)
    {   super(a);
        System.out.println("derived class constructor with value of b as:"+b);
    }

    }
class ChildOfDerived extends Derived1 //java does not support multiple inheritance
{
    public ChildOfDerived()
    {
        System.out.println("child of derived class constructor");
    }
    public ChildOfDerived(int a, int b, int c)
    {   super(a,b);
        System.out.println("child of derived class constructor with value of c as "+c);
    }

}

public class constructors_2 {
    public static void main(String[] args)
    {
      //ChildOfDerived cd=new ChildOfDerived();
        ChildOfDerived cd=new ChildOfDerived(12,13,15);

    }}
