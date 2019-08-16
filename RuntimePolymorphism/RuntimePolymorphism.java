//This is an example of runtime polymorphism 
class Week1 {
    public class C {
        void method1 (){
            System.out.println("Class c");
        }
    }
    public class B extends C{
        void method1(){
            System.out.println("class b");
        }
    }
    public static void main (String args []){
        Week1 week1 = new Week1();//Week1.C
        C c = week1.new C();
        B b = week1.new B();
        c.method1();
        b.method1();
    }
}