package com.sprint1.CabBooking.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sprint1.CabBooking.entity.Cab;
import com.sprint1.CabBooking.service.CabService;

@RestController
@RequestMapping("/api/cabs")
public class CabController {
	@Autowired
	private CabService cabservice;

	@PostMapping("/addCab")
	public ResponseEntity<String> addUser(@RequestBody Cab cab) {
		cabservice.addCab(cab);
		return ResponseEntity.ok("Cab Saved");
	}

	@GetMapping("/viewAllCabs")
	public ResponseEntity<List<Cab>> viewCabs() {
		List<Cab> cab = cabservice.viewCabs();
		return ResponseEntity.ok(cab);
	}

	@GetMapping("/cabsCount")
	public long countCabs() {
		long cab = cabservice.countCabs();
		return cab;
	}

	@GetMapping("/view/{CustomerId}")
	public ResponseEntity<Cab> viewCabsByCustomerId(@PathVariable("CustomerId") Integer CustomerId) {
		Cab cabs = cabservice.viewCabsByCustomerId(CustomerId);
		return ResponseEntity.ok(cabs);
	}

}
