package com.jaiworld.springboomvcrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaiworld.springboomvcrest.domian.Customer;
import com.jaiworld.springboomvcrest.repositories.CustomerRepository;



/**
 * @author jaideepvish
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	private final CustomerRepository customerRepository;
	
	CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
			
	}
	

	@Override
	public Customer findCustomerById(long id) {		
		return customerRepository.findById(id).get();
	}

	@Override
	public List<Customer> findAll() {		
		return customerRepository.findAll();
	}


	@Override
	public Customer saveCustomer(Customer customer) {		
		return customerRepository.save(customer);
	}


	@Override
	public void deleteCustomerById(long id) {		
		customerRepository.deleteById(id);;
	}

}
