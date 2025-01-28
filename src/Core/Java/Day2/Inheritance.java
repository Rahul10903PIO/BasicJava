package Core.Java.Day2;


class Vehicle{
    String color;
    int chassisNumber;
}

class Bike extends Vehicle{
    void setInfo(String color,int chassisNumber){
        this.color=color;
        this.chassisNumber =chassisNumber;
    }
    void getInfo(){
        System.out.println("Color = "+ this.color);
        System.out.println("ChassisNumber = "+ this.chassisNumber);
    }

}
public class Inheritance {
    public static void main(String[] args){
        Bike b=new Bike();
        b.setInfo("Blue",1234);
        b.getInfo();
    }

}
