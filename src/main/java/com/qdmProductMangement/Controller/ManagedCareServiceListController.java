package com.qdmProductMangement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qdmProductMangement.Entity.ServiceProvided;
import com.qdmProductMangement.Entity.ServicesData;
import com.qdmProductMangement.Service.ManagedCareService;

@RestController
@RequestMapping("/careSupervisor/management")
public class ManagedCareServiceListController {
	
	
	@Autowired
	ManagedCareService managedCareService;
	
	
	@Autowired
	ServiceProvided serviceProvider;
	
	
	@Autowired
	ServicesData serviceData;
	
	@GetMapping("/services/list/all")
	public ResponseEntity<List<ServicesData>> serviceProvided(){
		List<ServicesData> services= null;
		managedCareService.getServiceDetails();
		services = serviceProvider.getServiceData();
        return ResponseEntity.accepted().body(services);
	}

}
