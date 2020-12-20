// constructorDemo class
public class constructorDemo{
    static int Demo=10;
    public static void main(String[] args){
        System.out.println("Start");
        new Student().age=10;
        System.out.println(new Student().age);
        new Student().age=20;
        System.out.println(new Student().age);
        System.out.println(constructorDemo.Demo);
        System.out.println("End");
    }
} 
// Student class
class Student{
    int age;
    Student(){}
    Student(int age){
        System.out.print("Before initialization my age attribute: "+this.age);
        System.out.println("Local variable: "+age);
        this.age=age;
        System.out.println("age attribute from constructor: "+this.age);
    }
}



//---------------------------------NOTES---------------------------------
//we use 'this' keyword to differentiate a attribute and a local variable that share a common name  
//"this" will always point to current class object
/*
Q: Can i use "this" in main method?
A: "this" can't be used inside main method because it is non-static reference variable and main is a static method and we know that we cant reference non static 
attributes from static method
*/

/*
********When we explicitly define a constructor with/without parameters then the default constructor provided by the compiler is not generated*******
*/
/*
If we want to use reuse objects 
But in temporary reference the object will be useful only in the statement in which it is created 
So if we want to use reuse we should create permanent reference
The permannent ref should be of same type as the object
*/

/* 
we dont have pointers in JAva
Instead of pointers, object references are used in java
*/