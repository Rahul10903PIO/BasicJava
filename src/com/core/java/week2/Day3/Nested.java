package com.core.java.week2.Day3;


//Nested Class
class Order{
    private int orderId;
    private boolean isPlaced;
    private int payment;

    public Order(int orderId,boolean isPlaced,int payment){
        this.orderId=orderId;
        this.isPlaced=isPlaced;
        this.payment=payment;
    }

    public  class Payment{
        private Order ord;

        public Payment(Order ord){
            this.ord=ord;
        }

        public void getPaymentInfo(){
            if(ord.isPlaced){
                int paymentId=2323;
                System.out.println(String.format("Payment of %d received for Order Id %d and PaymentId is %d",ord.payment,ord.orderId,paymentId));
            }else{
                System.out.println("Order Is Not Placed");
            }
        }

    }

}


//  Method Local Inner Class

class SalaryCalculator{

    public double calcSalary(double salary){
        final int tds=10;
        class TaxCalc{
            double taxAmount;

            public TaxCalc(double salary){
                this.taxAmount=salary;
            }

            public double calculateTax(){
                double payableTax=(taxAmount*tds)/100;
                return payableTax;
            }



        }
        TaxCalc tc=new TaxCalc(salary);
        return salary-tc.calculateTax();
    }
}

public class Nested {
    public static void main(String[] args){


//        TaxCalculator Class Or Local Method inner Class
        SalaryCalculator sc=new SalaryCalculator();
        System.out.println(sc.calcSalary(15000));

//        Nested Inner Class
        Order ord=new Order(12,true,1200);
        Order.Payment pinfo=ord.new Payment(ord);
        pinfo.getPaymentInfo();

    }

}
