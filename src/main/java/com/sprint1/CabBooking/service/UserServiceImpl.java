package com.sprint1.CabBooking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sprint1.CabBooking.entity.Abstractuser;
import com.sprint1.CabBooking.entity.Customer;
import com.sprint1.CabBooking.entity.Driver;
import com.sprint1.CabBooking.exception.EmptyInputException;
import com.sprint1.CabBooking.repository.IUserRepository;

@Service
public class UserServiceImpl {
	@Autowired
	private IUserRepository abstractuser;

	// to add customer
	public Abstractuser addCustomer(Customer customer) {
		/*if(customer.getUserName().isEmpty()||customer.getUserName().length()==0) {
			throw new EmptyInputException();
		}*/
		return abstractuser.save(customer);
	}

	// to add driver
	public Abstractuser addDriver(Driver driver) {
		return abstractuser.save(driver);
	}

	// to get All Users
	public List<Abstractuser> findAllUsers() { 
		return abstractuser.findAll();

	}
}
