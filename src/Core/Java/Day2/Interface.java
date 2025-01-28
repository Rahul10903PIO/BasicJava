package Core.Java.Day2;
interface LivingBeing{
    void eat();
}
class Human implements LivingBeing{
    public void eat(){
        System.out.println("Human Eats");
    }

}
public class Interface {
    public static void main(String[] args){
        Human h=new Human();
        h.eat();
    }

}
