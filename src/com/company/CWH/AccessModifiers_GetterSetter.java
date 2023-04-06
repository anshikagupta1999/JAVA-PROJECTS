package com.company.CWH;

import static com.company.CWH.Person.getProfession;
import static com.company.CWH.Person.setProfession;

//abstraction-hiding unnecessary details or internal details-android app development
//encapsulation-act of putting various components together-laptop has wifi,speaker,storage in single box
//Inheritance-creating new things from existing things-creating e rickshaw from existing rickshaw
//polymorphism- One entity many forms-function overloading
 class Person
{
    int age;
    String name;
    static String profession;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static String getProfession() {
        return profession;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setProfession(String profession1) {
        profession = profession1;
    }
}
public class AccessModifiers_GetterSetter {
    public static void main(String[] args)
    {
        Person a=new Person();
        Person b=new Person();

        a.setAge(11);
        a.setName("Sana");
        a.setProfession("staticProfession");
        b.setProfession("staticProfession1");
        b.setAge(31);
        b.setName("rupal");

        System.out.println(a.getAge());
        System.out.println(b.getName());
        System.out.println(a.getProfession());
        System.out.println(b.getProfession());//run this line
    }

}
//PUBLIC-accessible in class,in package,subclass in different package,world
//PRIVATE-inside class only
//DEFAULT-
//PROTECTED-class,package,subclass