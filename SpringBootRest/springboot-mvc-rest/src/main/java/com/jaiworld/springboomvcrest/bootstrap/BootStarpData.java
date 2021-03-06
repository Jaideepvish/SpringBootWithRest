package com.jaiworld.springboomvcrest.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jaiworld.springboomvcrest.domian.Customer;
import com.jaiworld.springboomvcrest.repositories.CustomerRepository;



@Component
public class BootStarpData implements CommandLineRunner {
	
	private final CustomerRepository customerRepository;	
	

	public BootStarpData(CustomerRepository customerRepository) {		
		this.customerRepository = customerRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Loading Customer Data");
		
		Customer c1 = new Customer();
		c1.setFirstName("Jai");
		c1.setLastName("vish");
		customerRepository.save(c1);
		
		Customer c2 = new Customer();
		c2.setFirstName("Ram");
		c2.setLastName("vish");
		customerRepository.save(c2);
		
		Customer c3 = new Customer();
		c3.setFirstName("charan");
		c3.setLastName("vish");
		customerRepository.save(c3);
		
		System.out.println("customer saved " + customerRepository.count());

	}

}

