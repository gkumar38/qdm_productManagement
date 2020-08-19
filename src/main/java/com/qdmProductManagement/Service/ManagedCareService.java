package com.qdmProductManagement.Service;


import org.springframework.stereotype.Service;

import com.qdmProductMangement.Entity.ServicesData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ManagedCareService {
	
	@Autowired
	ServicesData servicesData;
	
	
	public List<ServicesData> getServiceDetails(){
		//Call DB executed and set values
		
		
		
		return null;
	}
	
	

}
