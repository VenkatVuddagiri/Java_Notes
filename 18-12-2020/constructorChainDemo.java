public class constructorChainDemo{
    public static void main(String[] args) {
        // System.out.println(e);
    }
}

class Person1{
    Person1(){
        System.out.println("Person 2");
    }
    Person1(int d){
        System.out.println("Person 1");
    }
}

class Employee1 extends Person1{
    Employee1(){
        System.out.println("EMployee 2");
    }
    Employee1(int d){
        super(10);
        System.out.println("Employee 1");
    }
}

class PerEmployee extends Employee1{

}
/*
    

*/