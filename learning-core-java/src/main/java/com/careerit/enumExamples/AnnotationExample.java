package com.careerit.enumExamples;
class One
{
    void m1()
    {
        System.out.println("m1-one");

    }
}
class Two extends One
{
    //Anything that we write with @ is annotation
    //Annotation is a type of Metadata which specifies where it can be applied
    @Override
    void m1()
    {
        System.out.println("m1-two");
    }
}
public class AnnotationExample
{
    public static void main(String[] args) {
        One obj=new Two();
        obj.m1();
    }
}
