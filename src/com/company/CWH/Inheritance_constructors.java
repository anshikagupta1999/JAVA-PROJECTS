package com.company.CWH;
class Base
{
    int id;
    String name;

    public Base(int i, String nm) {
        this.id=i;
        this.name=nm;
    }//constructors can be overloaded
    //using constructors we can do the same task as getters and setters
    //we can't override constructors
    //constructor can be inherited
    public Base() {
        id=89;
        name="inside default constructor";
        System.out.println(name);
    }
    public Base(int a) {
        System.out.println("base class constructor of value of a as: "+a);
    }
}
class Derived extends Base //java does not support multiple inheritance
{
    public Derived()
    {super(0);
        System.out.println("derived class constructor");
    }
    String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
public class Inheritance_constructors {
    public static void main(String[] args)
        {
    Base b=new Base(1,"nm");//constructor called
    Base c=new Base(2,"inside parameterised constructor");
    Base d=new Base();//default constructor called of base class
    System.out.println(b.id);
    System.out.println(b.name);
    System.out.println(c.id);
    System.out.println(c.name);
    Derived e=new Derived();//derived class constructor called along with base class required constructor
    e.id=99;
    e.name="vansh";
    e.setProfession("digital marketing");
    System.out.println(e.id +" "+ e.name);
    String prof=e.getProfession();
    System.out.println(prof);


}}