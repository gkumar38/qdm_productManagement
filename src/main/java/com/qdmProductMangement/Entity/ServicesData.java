package com.qdmProductMangement.Entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class ServicesData {
	@Getter @Setter
	private int serviceId;
	@Getter @Setter
	private String serviceName;
	@Getter @Setter
	private List<String> level;
	@Getter @Setter
	private String status;
	
	
	

}
