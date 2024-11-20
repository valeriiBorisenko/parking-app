package se.lexicon.data.dao;

import se.lexicon.model.Customer;

import java.util.Collection;
import java.util.Collections;

public class CustomerDaoCollection implements CustomerDao {

    private Collection<Customer> customers;

    public CustomerDaoCollection(Collection<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Customer create(Customer customer) {
        return this.customers.add(customer) ? customer : null;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer: this.customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void remove(int id) {
        this.customers.remove(findById(id));
    }

    @Override
    public Customer findByReservationId(int id) {
        for (Customer customer: this.customers) {
            if (customer.getReservation() != null && customer.getReservation().getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public Collection<Customer> findAll() {
        return Collections.unmodifiableCollection(this.customers);
    }
}
