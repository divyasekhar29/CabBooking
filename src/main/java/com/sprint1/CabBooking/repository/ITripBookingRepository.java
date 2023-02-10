package com.sprint1.CabBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sprint1.CabBooking.entity.TripBooking;

public interface ITripBookingRepository extends JpaRepository<TripBooking, Integer> {

}
