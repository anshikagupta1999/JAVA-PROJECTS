package com.company.CWH;
//object is created at run time
class Phone
{
    public void greet()
    {
        System.out.println("good morning!");
    }
    public void name()
    {
        System.out.println("my name is java in class phone");
    }
}
class SmartPhone extends Phone
{
    public void swagat()
    {
        System.out.println("suprabhat!");
    }
    public void name()
    {
        System.out.println("my name is java in class smart phone");
    }
}
public class DynamicMethodDispatch {
    public static void main(String [] args)
    {
//        Phone obj1=new Phone();
//        obj1.name();
//        SmartPhone obj2=new SmartPhone();
//        obj2.name();
        Phone obj3=new SmartPhone();   //----->Phone(Super class) is the reference/address and SmartPhone(Sub class) is the object
        obj3.greet();
        obj3.name();   //------>this is called as run time polymorphism
       // obj3.swagat();  ----> produces error
    }

}
