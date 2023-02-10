package com.sprint1.CabBooking.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends Abstractuser {
	//Bidirectional with TripBooking
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<TripBooking> tripbooking;

}