package com.careerit.day13;
class MyMath{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int getPostInc(int a)
    {
        return a++;
    }
    public int getPreInc(int a)
    {
        return ++a;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    //varEx length operator which is similar to single dimensional array.
    public int add(int ...a)
    {
        int result=0;
        System.out.println("varEx method performed: ");
        for(int i:a)
        {
            result=result+i;
        }
        return result;
    }
}

public class MethodManager
{
    public static void main(String[] args)
    {
        MyMath obj=new MyMath();
        int res1=obj.add(10,20);
        System.out.println("res1: "+res1);
        int res2=obj.add(10,20,20);
        System.out.println("res2: "+res2);
        //here in the below instances jvm will not find exact method to perform an operation.
        // At this instance VarEx operator method will be called.
        int res3=obj.add(10);
        System.out.println("res3: "+res3);
        int res4=obj.add(1,2,3,4,5,6);
        System.out.println("res4: "+res4);
        //Here even in the below case,
        // the exact match was not found hence promotion of datatype was implemented.
        //char 'a' is changed into int with the ascii value of a=97
        int res5=obj.add('a',1);
        System.out.println("res5: "+res5);
        //promotion is nothing but typecasting which can be downwards or upwards
        //upcasting can be done by the compiler itself.


    }

}
