class firstDemo {
    public static void main(String[] args){
        Student s = new Student(20,101,"Venkat");
        Student s1=s;
        Student s2 = s1;
        s2.printData();
        s.printData();
    }    
}

class Student{
    int age,roll;
    String name;//non-static attribute
    Student(){}
    Student(int age,int roll,String name){
        this.age=age;
        this.roll=roll;
        this.name=name;
    }
    public void printData(){
        System.out.println(this.age);
        System.out.println(this.roll);
        System.out.println(this.name);
    }
}

//------------MEMORY MANAGEMENT------------
//non-primitive data types are used for object reference
//detachable-objects are of no use, they are removed from the stack area by garbage collector
//It is managed by JVM
//Memory management for java is automatic
//Upon the call to garbage collector, it marks all detachable objects and they are removed from memory
// Algorithm used by garbage collector - "Mark and sweep"

/*
system.gc()
If you want to write any mandatory logic while creating the object 
we write it in the constructor
*/

//A single object can have more than one link, but a single name cannot reference more than one object