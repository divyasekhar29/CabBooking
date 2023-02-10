package com.sprint1.CabBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sprint1.CabBooking.entity.Abstractuser;

@Repository
public interface IUserRepository extends JpaRepository<Abstractuser, Integer> {

}
