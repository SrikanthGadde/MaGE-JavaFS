package com.manipal.demo.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.demo.model.Capital;

@FeignClient(name="capital-service")
@RibbonClient("capital-service")
public interface CapitalProxy {
	
	@GetMapping("capital-service/zipcode/{zipcode}")
	public Capital getCapitalWithZipcode(@PathVariable String zipcode);
	
	@GetMapping("capital-service/capital/{capitalName}")
	public Capital getCapitalWithCapitalName(@PathVariable String capitalName);
}