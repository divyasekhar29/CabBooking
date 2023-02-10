package com.sprint1.CabBooking.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Driver extends Abstractuser {
	private String licenseNo;
	private String location;

	//Bidirectional with TripBooking
	@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
	private List<TripBooking> tripbooking;

	//Unidirectional with Cab
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cabId")
	private Cab cab;
}