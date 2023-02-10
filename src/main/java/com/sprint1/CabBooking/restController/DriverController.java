package com.sprint1.CabBooking.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sprint1.CabBooking.bean.DriverBean;
import com.sprint1.CabBooking.service.DriverServiceImpl;

@RestController
@RequestMapping("/api/driver")
public class DriverController {

	@Autowired
	private DriverServiceImpl driverServiceImpl;

	// to get all drivers
	@GetMapping("/getAllDrivers")
	public ResponseEntity<List<DriverBean>> findAllDrivers() {
		List<DriverBean> driver = driverServiceImpl.findAllDrivers();
		return ResponseEntity.ok(driver);
	}

}
