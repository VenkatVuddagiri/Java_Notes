public class thisDemo{
    public static void main(String[] args){
        System.out.println("Start");
        Student s1=new Student("Venkat",52,19);
        System.out.println(s1.name);
        // new Student("Sharath",49,19);
        new Student();
        // new Student();
        // new Student("prahas",31,19);
        // System.out.println(s1.count);
        // System.out.println(Student.count);
        System.out.println("end");
    }
    {
        System.out.println("IIB-3");
    }
}

class Student{
    static int count;
    int id,age;
    String name;
    Student(){
        // count++;
        System.out.println("No-Arg");
    }
    Student(String name,int id,int age){
        // this();
        // System.out.println(Student.count);
        this.name=name;
        this.age=age;
        this.id=id;
        System.out.println("Arg");
    }
    {
        System.out.println("IIB-1");
        // count++;
    }
    {
        System.out.println("IIB-2");
    }
}

//code redundancy is known as boiler plate code
//Initialization block 
/*
{
    example of an instance initialization block
} 
*/
/* 
Instance is nothing but an *object*

Instance Initialization blocks:
The initialization blocks are executed first before each and every new object creation or constructor call
We can write any number of Instance initialization blocks for a single block

*/

/* 
Second type of initialization block
Static initialization block
static{
    // example of static initialization block
}
*/

/*
Why constructor is not static?
Constructor definition should not be static because constructor will be called each and every time when object is created.
If you made constructor as static then the constructor will be called before object creation same like main method.
*/

/*
Why main method is static?
java thisDemo is same is java thisDemo.main()
For this to execute main should be static
*/