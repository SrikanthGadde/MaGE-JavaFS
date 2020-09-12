package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Telephone;
import com.manipal.service.TelephoneServiceImpl;

@RestController
@RequestMapping("/telephone")
public class TelephoneController {
	
	@Autowired
	TelephoneServiceImpl service;
	
	@PostMapping
	public ResponseEntity<Telephone> addTelephone(@RequestBody Telephone telephone)	{
		return new ResponseEntity<Telephone>(service.addTelephone(telephone), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Telephone>> getAll() {
		return new ResponseEntity<List<Telephone>>(service.getAll(),HttpStatus.OK);
	}
	
	@GetMapping("{telephoneId}")
	public ResponseEntity<Telephone> getTelephone(@PathVariable int telephoneId) {
		return new ResponseEntity<Telephone>(service.getTelephone(telephoneId),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Telephone> updateTelephone(@RequestBody Telephone telephone){	
		service.updateTelephone(telephone);
		return new ResponseEntity<Telephone>(telephone,HttpStatus.OK);
	}
	
	@DeleteMapping("{telephoneId}")
	public ResponseEntity<String> deleteTelephone(@PathVariable int telephoneId){
		service.deleteTelephone(telephoneId);
		return new ResponseEntity<String>("Telephone with ID "+telephoneId+" was successfully deleted",HttpStatus.OK);
	}
	
}
