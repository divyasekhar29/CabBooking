package com.sprint1.CabBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sprint1.CabBooking.entity.Driver;

public interface IDriverRepository extends JpaRepository<Driver,Integer>{

}
