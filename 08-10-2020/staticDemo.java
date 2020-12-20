//static initialization block
public class staticDemo{
    int i=10;
    public static void main(String[] args){//main-method
        System.out.println("Main start");
        new Person(52,12,"Venkat");
        new Person();
        int i=Person.count;
        System.out.println(i);
        System.out.println(new staticDemo().i);
        System.out.println("Main end");
    }
    {//iib
        System.out.println("Instance Initialization Block of staticDemo class");
    }
    static{//sib
        System.out.println("Static Initialization Block of staticDemo class");
    }
}
class Person{
    int age,id;
    String name;
    static int count;
    {
        System.out.println("Instance Initialization block-1");
    }
    // {
        // System.out.println("Instance Initialization block-2");
    // }
    static{
        System.out.println("Static Initialization block-1");
    }
    static{
        System.out.println("Static Initialization block-2");
    }
    Person()
    {
        System.out.println("No arg Constructor");
        count++;
    }
    Person(int id,int age,String name)
    {
        System.out.println("3 arg Constructor");
        count++;
    }
}

/*
------------------------------------------------------NOTES-------------------------------------------------
=>Whenever the .class file is loaded into the main memory for the ***first time*** due to the execution of attribute/
the execution block (methods,initialization blocks,constructors) of that class,the static initialization blocks of 
the class will be executed first.
=>Can we have any executable methods before main method?
    Yes it is possible by using static initialization blocks
=>Can we overload main method?

========================================Command Line Arguments==============================================
    
============================================================================================================
------------------------------------------------------------------------------------------------------------
*/