package com.careerit.day19;

import java.util.List;

class outer
{
    //The name is the instance variable of outer class
    List<String> name= List.of("Krish","Yogi","Ram","vishnu");
    //creating a new inner class
    class inner
    {
        //The variables declared for the outer class can be used by the inner class
        //If the inner class is declared static we need to declare the outer class variables also static
        void show()
        {
            for(String ele:name)
            {
                System.out.println(ele);
            }
        }
    }
}

public class InnerclassExample
{
    public static void main(String[] args) {
        //creating an object to access inner class
        //1 st way create an object for outer class and using that create inner object
        outer obj=new outer();
        outer.inner inner=obj.new inner();
        inner.show();
        //2 nd way
        outer.inner inner1=new outer().new inner();
        inner1.show();
    }

}
