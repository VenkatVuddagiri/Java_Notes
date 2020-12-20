public class secondDemo {
    public static void main(String[] args){
        student s = new student(19);
        System.out.println(s.age);
        // System.out.println(s.roll);
        System.out.println(student.roll);
    }
}

class student{
    int age;
    static int roll=301;
    student(int age){
        this.age=age;
    }
}
//Diff b/w static and non-static attributes
/*
The static members are generic to all objects of the class, while non static members are specific to an object

Static members will be there in the class area whereas non-static attributes are there in the object area

Static members can be used in non-static area directly whereas non-static members cannot be used directly in static context

We can use object reference to ref non-static members as well as to refer non-static members
*/ 

//We can refer static members via class name also

//Constructor Overloading

/*  
As long as The constructor signature is changing there can be any number of constructors in the same class
*/