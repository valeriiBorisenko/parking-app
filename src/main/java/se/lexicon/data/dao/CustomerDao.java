package se.lexicon.data.dao;

import se.lexicon.model.Customer;

import java.util.Collection;

public interface CustomerDao {
    Customer create(Customer customer);
    Customer findById(int id);
    void remove(int id);
    Customer findByReservationId(int id);
    Collection<Customer> findAll();

}
