package com.sprint1.CabBooking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sprint1.CabBooking.entity.Cab;
import com.sprint1.CabBooking.repository.ICabRepository;

@Service
public class CabService {
	@Autowired
	private ICabRepository cabrepo;

	// to add cab
	public Cab addCab(Cab cab) {
		return cabrepo.save(cab);
	}

	// to view cabs
	public List<Cab> viewCabs() {
		return cabrepo.findAll();
	}

	// to count cabs
	public long countCabs() {
		return cabrepo.count();
	}

	// to view cabs by customerId
	public Cab viewCabsByCustomerId(Integer id) {
		return cabrepo.findById(id).get();
	}

}