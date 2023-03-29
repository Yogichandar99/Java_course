package com.careerit.day13;
class Parent extends Object{
    Parent()
    {
        super();
        System.out.println("parent-constructor");
    }
    {
        System.out.println("parent-IIB block");
    }
}
class Two extends Parent{
    static
    {
        System.out.println("static block-1");
    }
    Two(){
        System.out.println("constructor");
    }
    static
    {
        System.out.println("static block-2");
    }
    {
        System.out.println("IIB");
    }
}
public class IIBExample
{
    public static void main(String[] args)
    {
        Two obj1=new Two(); //static block-1 static block-2 parent-IIB block parent-constructor IIB constructor output
        //the flow will be after object creation, it will load the two constructor and print the static blocks
        //later after static, super method in two refers to parent and parent super method refers to object,
        // In parent block Instance initialisation block is executed first followed by parent constructor
        // later on control gets back to two constructor and instance initialisation block of two is executed followed by constructor method.
        //Two obj2=new Two();

    }

}
