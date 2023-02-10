package com.sprint1.CabBooking.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sprint1.CabBooking.bean.DriverBean;
import com.sprint1.CabBooking.repository.IDriverRepository;

@Service
public class DriverServiceImpl {

	@Autowired
	private IDriverRepository driver;

	// to get All drivers
	public List<DriverBean> findAllDrivers() {
		List<DriverBean> list = new ArrayList<>();
		driver.findAll().stream().forEach(c -> {
			list.add(new DriverBean(c, true));
		});
		return list;
	}

}
