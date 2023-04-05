package com.careerit.day18;
//Info of type of interface
@FunctionalInterface
//The below interface is a functional interface as it has only one abstract method
//To check whether Functional Interface or not we can give syntax as @FunctionalInterface and interface definition
interface I1
{
    void m1();
    default void m2()
    {
        System.out.println("M2 method declared with default");
    }
    private void m3()
    {
        System.out.println("M3 with private signature");
    }
    private static void m4()
    {
        System.out.println("M4 with private static signature");
    }
}
//This is Marker interface
//Which is useful for giving Tagging information tp JVM
interface I2{

}

public class InterfaceExample4 {
}
