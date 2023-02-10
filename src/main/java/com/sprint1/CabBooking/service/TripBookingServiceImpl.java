package com.sprint1.CabBooking.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sprint1.CabBooking.Helper.TripBookingHelper;
import com.sprint1.CabBooking.bean.TripBookingBean;
import com.sprint1.CabBooking.entity.TripBooking;
import com.sprint1.CabBooking.exception.EmptyInputException;
import com.sprint1.CabBooking.repository.ITripBookingRepository;

@Service
public class TripBookingServiceImpl {

	@Autowired
	private ITripBookingRepository tripbookingrepo;

	// to get All trips
	public List<TripBookingBean> getAllTrips() {
		List<TripBookingBean> list = new ArrayList<>();
		tripbookingrepo.findAll().stream().forEach(trip -> {
			list.add(new TripBookingBean(trip, true));
		});
		return list;
	}

	// to add trip
	public TripBooking addTripBooking(TripBooking tripBooking) {
		if (tripBooking.getTripBookingId() == null) {
			throw new EmptyInputException();
		}
		return tripbookingrepo.save(tripBooking);
	}

	// to get trip by Id
	public TripBookingBean findTripBookingById(int tripBookingId) {
		return TripBookingHelper.generateTripBookingBean(tripbookingrepo.findById(tripBookingId).get());
	}

	// to cancel trip
	public void cancelTripBookingById(Integer tripBookingId) {
		tripbookingrepo.deleteById(tripBookingId);
	}

}
