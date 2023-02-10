package com.sprint1.CabBooking.bean;

import java.util.ArrayList;
import java.util.List;

import com.sprint1.CabBooking.entity.Driver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverBean {
	private Integer userID;
	private String userName;
	private String mobilenumber;
	private String emailId;
	private float rating;
	private String liscenseNo;
	private String location;

	private List<TripBookingBean> trips;

	public DriverBean(Driver driver, Boolean buildTrip) {
		userID = driver.getUserId();
		userName = driver.getUserName();
		mobilenumber = driver.getMobilenumber();
		emailId = driver.getEmailId();
		rating = driver.getRating();
		liscenseNo = driver.getLicenseNo();
		location = driver.getLocation();
		if (buildTrip) {
			trips = new ArrayList<>();
			driver.getTripbooking().stream().forEach(d -> {
				trips.add(new TripBookingBean(d, false));
			});
		}
	}

}