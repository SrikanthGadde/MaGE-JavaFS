package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.exception.CustomerNotFoundException;
import com.manipal.model.Customer;
import com.manipal.model.Telephone;
import com.manipal.proxy.TelephoneProxy;
import com.manipal.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl {
	
	@Autowired
	private ICustomerRepository repository;
	@Autowired
	TelephoneProxy proxy;

	public Customer addCustomer(Customer customer) {
		Customer customerDB = repository.save(customer);
		Telephone telephone = customer.getCustomerTelephone();
		telephone.setTelephoneId(customerDB.getCustomerId());
		customerDB.setCustomerTelephone(proxy.addTelephone(telephone));
		return customerDB;
	}
	
	public List<Customer> getAll(){
		List<Customer> customerList = repository.findAll();
		for(Customer customer: customerList){
			customer.setCustomerTelephone(proxy.getTelephone(customer.getCustomerId()));
		}
		return customerList;
	}
	
	public Customer getCustomer(int customerId) {
		Customer customer = repository.findById(customerId).orElseThrow(()-> new CustomerNotFoundException(customerId));
		customer.setCustomerTelephone(proxy.getTelephone(customer.getCustomerId()));
		return customer;
	}
	
	public void updateCustomer(Customer customer) {
		Customer customerDB = this.getCustomer(customer.getCustomerId());
		if(customerDB!=null) {
			customerDB.setCustomerFirstName(customer.getCustomerFirstName());
			customerDB.setCustomerLastName(customer.getCustomerLastName());
			customerDB.setCustomerDateOfBirth(customer.getCustomerDateOfBirth());
			customerDB.setCustomerEmail(customer.getCustomerEmail());
			Telephone telephone = customer.getCustomerTelephone();
			telephone.setTelephoneId(customerDB.getCustomerId());
			customerDB.setCustomerTelephone(proxy.updateTelephone(telephone));
			repository.save(customerDB);
		}
		else {
			throw new CustomerNotFoundException(customer.getCustomerId());
			//this.addCustomer(customer);
		}
	}
	
	public void deleteCustomer(int customerId) {
		if(repository.existsById(customerId)) {
			repository.deleteById(customerId);
			proxy.deleteTelephone(customerId);
		}
		else
			throw new CustomerNotFoundException(customerId);
	}
	
	public Telephone getTelephone(int customerId) {
		return proxy.getTelephone(customerId);
	}
}
