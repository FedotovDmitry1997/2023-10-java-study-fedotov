package ru.otus.java.fedotov;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@SuppressWarnings({"java:S1186", "java:S1135", "java:S1172"}) // при выполнении ДЗ эту аннотацию надо удалить
public class CustomerService {

    // todo: 3. надо реализовать методы этого класса
    // важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны
    private final NavigableMap<Customer, String> customerMap = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        // Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk
        Map.Entry<Customer, String> nextCustomer = customerMap.firstEntry();
        if (nextCustomer == null) {
            return null;
        }
        return Map.entry(
                new Customer(
                        nextCustomer.getKey().getId(),
                        nextCustomer.getKey().getName(),
                        nextCustomer.getKey().getScores()),
                nextCustomer.getValue());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> nextCustomer = customerMap.higherEntry(customer);
        if (nextCustomer == null) {
            return null;
        }
        return Map.entry(
                new Customer(
                        nextCustomer.getKey().getId(),
                        nextCustomer.getKey().getName(),
                        nextCustomer.getKey().getScores()),
                nextCustomer.getValue());
    }

    public void add(Customer customer, String data) {
        customerMap.put(customer, data);
    }
}
