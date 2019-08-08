package com.fingertech.api.FingertechAPI.interfaces;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.fingertech.api.FingertechAPI.Models.Digital;


public interface digitalRepository extends CrudRepository<Digital, String> {
	
	

}
