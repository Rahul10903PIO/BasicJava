package Core.Java.Day2;

// This class Performing Run time polymorphism
class LivingBeings{
    void eat(){
        System.out.println("Living Being eat");
    }
    void walk(){
        System.out.println("Living Beings Walk");
    }
}
class Humans extends LivingBeings{
    void eat(){
        System.out.println("Humans eat");
    }
    void walk(){
        System.out.println("Humans Walk");
    }
}

// Compile Time Polymorphism
class Calc{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

}
public class Polymorphism {
    public static void main(String[] args){
        Humans h=new Humans();
        h.eat();
    }

}
