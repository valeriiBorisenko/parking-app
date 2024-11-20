package se.lexicon.data.dao;

import se.lexicon.model.ParkingSpot;

import java.util.Collection;

public interface ParkingSpotDao {
    ParkingSpot findBySpotNumber(int spotNumber);
    void remove(int number);
    Collection<ParkingSpot> findAll();
    Collection<ParkingSpot> findByAreaNumber(int areaCode);
    boolean occupy();
    boolean vacate();
}
