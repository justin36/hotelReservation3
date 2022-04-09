package model;

import java.util.regex.Pattern;

public class Customer {

    String firstName;
    String lastName;
    String email;
    String emailRegex = "^(.+)@(.+).com$";
    Pattern pattern = Pattern.compile(emailRegex);

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Customer(String firstName, String lastName, String email){
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, Invalid email");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }


}
