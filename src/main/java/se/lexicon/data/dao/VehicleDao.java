package se.lexicon.data.dao;

import se.lexicon.model.Vehicle;

import java.util.Collection;

public interface VehicleDao {
    Vehicle findByLicensePlate(int licensePlate);
    Vehicle create(Vehicle vehicle);
    boolean remove(int licensePlate);
    Vehicle update(Vehicle vehicle);
    Collection<Vehicle> findAll();
}
