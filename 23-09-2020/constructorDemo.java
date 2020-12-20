public class constructorDemo{
    public static void main(String[] args){
        System.out.println("From main method");
        System.out.print("Before\n");
        Student.toTest();
        System.out.println("After\n");
    }
}
class Student{
    public static void main(String[] args){
        System.out.println("inside main method");
        toTest();
        for (int i=0;i<10;i++) {
            System.out.println(args[i]+"\n");
        }
    }   
    static void toTest(){
            System.out.println("From student class inside to test method");
    }
    
}