package ru.otus.java.fedotov;

import java.util.LinkedList;
import java.util.List;

public class CustomerReverseOrder {

    private List<Customer> customerList = new LinkedList<>();

    public void add(Customer customer) {
        customerList.addFirst(customer);
    }

    public Customer take() {
        return customerList.removeFirst();
    }
}
