public class TypeCastingDerivedDemo{
    public static void main(String[] args) {
        Person1 p = new Person1();
        Employee1 e = (Employee1)p;
        ((Employee1)p).toTest(10.0);
    }
}

class Person1{
    int id=100;
    Employee1 toTest(){
        System.out.println("Inside Person1 test class");
        return null;
    }
}

class Employee1 extends Person1{
    int id=100;
    int salary=10_00_000;
    public PermanentEmployee toTest(double d){
        System.out.println(d);
        return null;
    }
}

class PermanentEmployee extends Employee1{
    int id=100;
}

/* 
    In case of derived data types type casting 2 crite:
        1.As per the compiler, type casting can happen when there is a inheritance relationship between them
        2.In case of assignment, the compiler will check the Left hand entity should be same as right hand entity or
        the right hand entity should be greater than left hand side class/entity

    Because of type casting, a new object is not created, but a new path is created for the same object

    What if we have a class "Student" extending person class
    
        Person1 p =new Employee1();
        Student1 s = (Employee1)p;

     We are type casting person class into employee class. Because student and employee are not related with inheritance 
     the compiler will raise an error

            person p = new person();
            employee emp = (employee)p;
    
    But at the runtime we will get an exception because we are type casting super class into a sub class for above statements
    
    The object can be type casted into same class or any super class, but casting into subclass will raise an exception

    There can be multiple classes in the type casting list, but if the type casting list has atleast one sub class or any irrelevant
    class in the type casting list, then we will get a class-cast exception

    Person1 p = new Employee1();
    Employee1 emp = (Employee1)(Person1)p;
    
    As per compiler,
        The person class reference can point to employee class object
        The reference variable p is typecasted to person type, then p is casted again into employee 
        Now emp is assigned to the employee1 type
    As per JVM,
        There are no subclasses and no irrelevant classes in the statements,
        so this will compile and run successfully

    Person p = new Employee();
    Student emp = (Student)(Person)p;

    */