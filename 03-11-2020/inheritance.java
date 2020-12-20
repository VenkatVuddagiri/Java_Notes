class inheritance{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
        // SuperClass sc = new SubClass();

        // Person p = new Employee();
        // p.display(); -->Gives error
        
        e.display();
    }
}

class Person{
    // String name="Venkat";
    int hno=1101;
    String name;

    public void toTest(){
        System.out.println("Im inside totest method person");
    }
}



class Employee extends Person{
    int id=101;
    double salary=1000000;
    public void display(){
        System.out.println("I am inside employee class");
        System.out.println("My hno is "+hno);
    }

    public void toTest(){
        System.out.println("Im inside totest method ");
    }
}

class SuperClass{

}

class SubClass extends SuperClass{

}

/*
    We can inherit only a single class using a single class
    
    Multiple inheritance using classes is not allowed in java

    Even sibling relationship is not acceptable in java only(parent and child)

    The reference variable of super class can refer to sub class object, but viceversa is not possible

    SuperClass sc = new SubClass(); -->Parent class reference variable can refer to the object of child class

    Super class reference variables should not be used to access the subclass members,but subclass references can refer / access 
    super class members

    We can have same attribute name in both super and sub class

    
*/