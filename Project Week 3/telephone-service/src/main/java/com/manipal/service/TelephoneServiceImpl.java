package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.exception.TelephoneNotFoundException;
import com.manipal.model.Telephone;
import com.manipal.repository.ITelephoneRepository;

@Service
public class TelephoneServiceImpl {
	
	@Autowired
	private ITelephoneRepository repository;

	public Telephone addTelephone(Telephone telephone) {
		return repository.save(telephone);
	}
	
	public List<Telephone> getAll() {
		return repository.findAll();
	}
	
	public Telephone getTelephone(int telephoneId) {
		return repository.findById(telephoneId).orElseThrow(() -> new TelephoneNotFoundException(telephoneId));
	}
	
	public void updateTelephone(Telephone telephone) {
		Telephone telephoneDB = this.getTelephone(telephone.getTelephoneId());
		if(telephoneDB!=null) {	
			telephoneDB.setTelephoneNumber(telephone.getTelephoneNumber());
			telephoneDB.setMobileNumber(telephone.getMobileNumber());
			repository.save(telephoneDB);
		}
		else {
			throw new TelephoneNotFoundException(telephone.getTelephoneId());
			//repository.save(telephone);
		}
	}
	
	public void deleteTelephone(int telephoneId) {
		if(repository.existsById(telephoneId))
			repository.deleteById(telephoneId);
		else
			throw new TelephoneNotFoundException(telephoneId);
	}
	
}
