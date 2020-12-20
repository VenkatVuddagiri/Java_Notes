// public class thisDemo {
//     public static void main(String[] args){
//         System.out.println("Start");
//         for(int i=0;i<(args.length);++i){
//             System.out.println(args[i]);
//         }
//         System.out.println("End");
//     }
// }

class EncapDemo{
    public static void main(String[] args) {
        person p = new person(); 
        System.out.println(); 
        // p.age=20;
        // System.out.println("The age of the person is "+p.age); 

    }
}

class person{
    private int age;
    {
        System.out.println("IIB");
    }
}
/*
====================================================================================================
                                    COMMAND LINE ARGUMENTS
                                    ----------------------
Definition:
        The values which we send while executing java command is known as command line arguments. These cmd arguments are stored as
        String array. Whenever we enter any value after class name while execution is treated as string arguments
        To support command line arguments at the time of run time String[] args is used.
Usage:
        To pass command line arguments to the program
        Any array in java is considered to be as derived data types
        We can send null as a value to any derived data type
Syntax:
        java <Generated .class file name without extension> arg1 arg2 arg3 
                                        NOTES
                                -----------------------
    ->  Array class has an attribute 'length' which returns the length of the array 
        array.length;
    ->  The content that does not change at the time of execution is known as static content 
        and the content which changes is known as dynamic content
    ->  In case of strings the delimiter b/w static content and dynamic content is a '+' symbol(String concatenation)


                                    HOMEWORK QUESTIONS
                                    ------------------
Can we have multiple main methods inside a class?

what if we have two main methods in our applications?

name,height,weight,dob,country,gender

                                        OOPS CONCEPTS
                                        -------------
    ->  Encapsulation
    ->  Inheritance
    ->  Polymorphism
    ->  Abstraction

                                        ENCAPSULATION
                                        -------------
    ->  The restriction of access to a specific attribute that belongs to class can be restricted using 
        encapsulation
    1.Private
    2.Protected
    3.Default/Package
    4.Public
    ->  Any member with private access level can be used inside that class only
    ->  Initialization blocks do not have any access levels
    If we want to modify any private attribute of a class from other class, then that can be done using 
    2 of the special methods which can be used to access private attributes of a class
        ->Setter - Used to set the attribute value
        ->Getter - Used to get the attribute value
    The access specifier of both the methods should be public and non-static
=====================================================================================================
*/