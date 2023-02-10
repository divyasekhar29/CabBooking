package com.sprint1.CabBooking.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.sprint1.CabBooking.entity.Abstractuser;
import com.sprint1.CabBooking.entity.Customer;
import com.sprint1.CabBooking.repository.IUserRepository;
import com.sprint1.CabBooking.service.UserServiceImpl;



@SpringBootTest
public class CustomerTest {
	@Mock
	private IUserRepository abstractuser; // creating mock instance for class

	@InjectMocks
	private UserServiceImpl service = new UserServiceImpl();
	// creating new instance for Service class and
	// injecting the mock instance

	@BeforeEach
	public void beforeEach() {

		Abstractuser abstractuser = new Abstractuser();
		abstractuser.setUserName("siri");
		when(service.addCustomer(any(Customer.class))).thenReturn(abstractuser);
						
	}																

	@Test
	@DisplayName(value = "Testing customer for 1")
	void testAddCustomer1() {
		Abstractuser custDto = new Abstractuser();
		var o = "siri";
		custDto.setUserName(o);
		assertTrue(service.addCustomer((Customer) custDto).equals(o));
	}
}
