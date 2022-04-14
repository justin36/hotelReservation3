package service;

import model.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {

    static HashMap<String, Customer> customers = new HashMap<String, Customer>();

    public static void addCustomer(String email, String firstName, String lastName) {
        customers.put(email, new Customer(firstName, lastName, email));
    }

    public static Customer getCustomer(String customerEmail) {
        return customers.get(customerEmail);
    }

    public static Collection<Customer> getAllCustomers() {
        return customers.values();
    }

//    public static void main(String[] args) {
//        addCustomer("justinkim36@naver.com", "Joon", "Kim");
//
//        System.out.println(customers);
//
//        System.out.println(getCustomer("justinkim36@naver.com"));
//
//        System.out.println("-----");
//
//        System.out.println(getAllCustomers());
//    } I think this will take a long time. But let me think of a way how I could leverage the skills.
}
