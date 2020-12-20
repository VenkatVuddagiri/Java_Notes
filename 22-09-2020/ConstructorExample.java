//First class
public class ConstructorExample{
    static int CollegeCode=1;
    int aadhaarId;
    static void MyMethod1(){
        System.out.println("From method1");
    }
    void MyMethod2(){
        System.out.println("From method2");
    }
    //main
    public static void main(String[] args){
        System.out.println("Before method calling");
        new Student().StudentRoll(18011);
        MyMethod1();
        System.out.println(new ConstructorExample().aadhaarId);
        new ConstructorExample().MyMethod2();
        System.out.println("After method calling");
    }
    ConstructorExample(){
        aadhaarId=12345;
        System.out.print("From constructor\n");
    }
}
//second class
class Student{
    int age;
    String name;
    void admit(){
        System.out.println("From Student");    
    }
    void StudentRoll(int roll){
        System.out.println("The student roll number is "+roll);
    }
}

//Main memory   
//Heap Area - Class area(static members), Method Area(non static methods), Object Area(non static attributes)
//Stack area - psvm(),MyMethod1(),new ConstructorExample().MyMethod2();
//No return type  and access modifier are required for a constructor
// No argument do nothing Constructor consists of no  statements except opening and closing braces
//Same applies to class also
//The constructor provided by the compiler is default compiler


/*Object is created in the heap 
All the non static attributes are loaded into object with deafult methods
A ref to method area from object area is created
A temp ref for the whole object is created from the stack
After constructor execution, methods are executed with object ref
While creating the object the constructor will be executed */


/*
The execution of the code will depend on the object through which we are calling the methods
That's why JAVA is known as Object Oriented Programming Language
*/