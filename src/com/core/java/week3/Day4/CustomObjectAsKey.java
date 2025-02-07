package com.core.java.week3.Day4;

import java.util.*;

class Customer {

    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && name == customer.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void customerInfo() {
        System.out.println(String.format("Customer Id : %d\nCustomer Name : %s", this.id, this.name));
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class CustomObjectAsKey {
    public static void main(String[] args) {

        Map<Customer, List<String>> customerOrders = new HashMap<>();

        customerOrders.put(new Customer(1, "Rahul"), Arrays.asList("pen", "Pencil", "Eraser", "Book"));
        customerOrders.put(new Customer(2, "Ritesh Bhai"), Arrays.asList("wow facewash", "Nivea SunsCream"));
        customerOrders.put(new Customer(3, "Tushar"), Arrays.asList("Cold Coffee", "Patties"));
        customerOrders.put(new Customer(4, "Rahul"), Arrays.asList("Paise", "Dukh"));
        System.out.println(customerOrders.size());
        System.out.println("Total customers: " + customerOrders.size());

        for (Map.Entry<Customer, List<String>> item : customerOrders.entrySet()) {
            item.getKey().customerInfo();
            System.out.printf("Products Ordered By Customer %s: ", item.getKey().getName());
            System.out.println();
            List<String> itemsOrdered = item.getValue();
            for (String prod : itemsOrdered) {
                System.out.print(prod + " ");
            }
            System.out.println();
        }
        Set<Customer> set=new HashSet<>();
        set.add(new Customer(1, "Rahul"));
        set.add(new Customer(2, "Ritesh Bhai"));
        set.add(new Customer(3, "Tushar"));
        set.add(new Customer(4, "Rahul"));

        Iterator<Customer> itr=set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

