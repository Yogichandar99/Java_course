package com.careerit.day18;
import java.util.List;
@FunctionalInterface
interface M1{
    double perform(double a,double b);
}
class C1 implements M1{
    //In order to make this class working we need to define the abstract method
    public double perform(double a,double b)
    {
        return a+b;
    }
}
//If we want to perform a different operation then,
class C2 implements M1{
    public double perform(double a,double b)
    {
        return a*b;
    }
}
class MathOperations
{
    //Here in the class MathOperations we are having a
    // function result with parameters as a list and I1 type object ;
    public double result(List<Integer> list,M1 obj)
    {
        double res=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            res=obj.perform(res,list.get(i));
        }
        return res;
    }
}

public class InterfaceExample5
{
    public static void main(String[] args)
    {
        List<Integer> list=List.of(1,2,3,4,5,6);
        MathOperations obj=new MathOperations();
        //Here we are passing the list and c1 type object as parameters to the result function
        double res=obj.result(list,new C1());
        System.out.println(res);
        MathOperations obj1=new MathOperations();
        //Here we are passing the list and C2 type object as parameters to the result function
        double res1=obj.result(list,new C2());
        System.out.println(res1);
        // The above logic helps us in understanding what logic to choose during run time
        //i.e with object c1 we have performed addition and with object c2 we did multiplication
        //All the above can be done with Lamda expression,
        // In the above we have written a class to implement the functionality
        //However it is possible to implement the functionality using lamda expression
        //instead of object we pass the lambda expression
        MathOperations obj2=new MathOperations();
        //pass the list, object with has two parameters a,b and operation to perform.
        double res2=obj2.result(list,(a,b)->a>b?a:b);
        System.out.println(res2);
    }
}
