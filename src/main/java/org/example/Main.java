package org.example;


import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;


import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {


     MobilePhone mobilePhone = new MobilePhone("2343234343", new ArrayList<>());
     mobilePhone.addNewContact(new Contact("Burak", "34234223"));
     mobilePhone.addNewContact(new Contact("John Doe", "123123123"));
     mobilePhone.addNewContact(new Contact("Bob", "31415926"));
     mobilePhone.addNewContact(new Contact("Alice", "16180339"));
     mobilePhone.addNewContact(new Contact("Tom", "11235813"));
     mobilePhone.addNewContact(new Contact("Jane", "23571113"));
     mobilePhone.addNewContact(new Contact("Test", "12345678"));
     mobilePhone.printContact();


    }
}
