// package 03-11-2020;

public class methodOverriding {
    public static void main(String[] args) {
       Person p = new Employee(); 
       System.out.println(p.hno);
       p.toTest();
    }
}

/* 

    Static binding, but at the time of execution, the runtime environment look for the object to which we are referring

    This binding which occurs at the time of run time is called dynamic binding

    This is known as method overriding

    Suppose if we dont have toTest method in subclass, then the method in superclass is considered
    
    If the method name and list of arguments are same for two methods, each of them present in supercalss and sub class in inheritance
    then theese two methods are said to be in method overriding

    A method of subclass which has same name and same argument list as superclass method, then subclass method is said to be 
    overrided method of superclass
    */