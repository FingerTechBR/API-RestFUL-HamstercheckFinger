package com.fingertech.api.FingertechAPI.Controller;


import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fingertech.api.FingertechAPI.Models.Digital;
import com.fingertech.api.FingertechAPI.Utils.UtilsNitgen;
import com.fingertech.api.FingertechAPI.interfaces.digitalRepository;
import com.nitgen.SDK.BSP.NBioBSPJNI;


@RestController
@RequestMapping("/v1")
@ComponentScan("com.fingertech.api.FingertechAPI")
@CrossOrigin(origins="*")
public class checkFingerprint {
	
	
	NBioBSPJNI bsp;
	UtilsNitgen un = new UtilsNitgen();
	ArrayList<Digital> ad = new ArrayList<>();
	
		@Autowired
	   digitalRepository rp;
	  
	  
	
	
	
	@RequestMapping(value= "/checkby1to1/",method=RequestMethod.POST)
	public boolean checkFingerByReceiver(@RequestBody Digital fp){	
		rp.save(fp);
		ad = (ArrayList<Digital>) rp.findAll();
		return true;
		 
		
	}
	
	@RequestMapping(value= "/checkby1to1/",method=RequestMethod.GET)
	public String checkFingerByReceiver(@RequestParam("digital")  String digital) {	
		
		
		Digital d = new Digital();		
		d.setPrimeiradigital(digital);
	
		return un.check1toN( (ArrayList<Digital>) rp.findAll(), d).toString();
		
		
		
		
		
		
		
		
	}

}
