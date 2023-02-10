package com.sprint1.CabBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sprint1.CabBooking.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

}
