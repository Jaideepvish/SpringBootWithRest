package com.jaiworld.springboomvcrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaiworld.springboomvcrest.domian.Customer;



/**
 * @author jaideepvish
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
