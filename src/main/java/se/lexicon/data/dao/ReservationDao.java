package se.lexicon.data.dao;

import se.lexicon.model.Reservation;

public interface ReservationDao {
    Reservation findById(int id);
    boolean remove(int id);
    Reservation findByCustomerId(int id);
    Reservation findByVehicleLicensePlate (String licensePlate);
    Reservation findByParkingSpotNumber(int spotNumber);
}
