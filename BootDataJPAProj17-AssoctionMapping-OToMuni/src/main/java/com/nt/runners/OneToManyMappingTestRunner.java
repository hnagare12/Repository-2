package com.nt.runners;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.IOneToManyMappingMgntService;
@Component
public class OneToManyMappingTestRunner implements CommandLineRunner {
	@Autowired
private IOneToManyMappingMgntService service;
	@Override
	public void run(String... args)throws Exception{
		//Prepare child object
		PhoneNumber ph=new PhoneNumber();
		ph.setContactNo(9988776658L);ph.setNumbertype("office");
		ph.setProvider("airtel");
		PhoneNumber ph1=new PhoneNumber();
		ph1.setContactNo(8888999776L);ph1.setNumbertype("home");
		ph1.setProvider("VI");
		//Prepare parent object
		Person per=new Person();
		per.setPname("raja");per.setPaddres("HYD");
		per.setPhonesInfo(Set.of(ph,ph1));
		try {
			//invoke methode
			System.out.println(service.saveDataUsingParent(per));
		}//try
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
