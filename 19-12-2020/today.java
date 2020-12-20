/*
Recursion:
    Calling an executable block from the same block is known as recursion 
Note:
    Executable blocks in java:
        Constructor
        Initialization block
        Method
    Executing the constructor recursively either with super or this will give us compile time error

    Can we execute a constructor without creating an object?
        class Person{
            int id;
            String name;
            int age;
            Person()
            {
                System.out.println("Hello");
            }
        }
        class Demo{
            public static void main(String[] args){
                new Person();
            }
        }
    
    If we create an object using a constructor within the same constructor will lead to an stackoverflow exception

    Object class is the super most class of all the classes in Java

    This can be done within the constructor only

    What is the definition of constructor chaining?
        Executing the current class constructor after its super class constructor upto the object class  no argumented 
        constructor  as a chain is called constructor chaining
    
    What is the advantage of constructor chaining?
        Reusage of super class constructor in child class constructor is the main advantage of constructor chaining
*/