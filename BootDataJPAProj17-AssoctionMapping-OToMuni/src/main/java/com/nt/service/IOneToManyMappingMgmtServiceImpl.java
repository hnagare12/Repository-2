package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.repo.PersonRepo;
@Service("otmService")
public class IOneToManyMappingMgmtServiceImpl implements IOneToManyMappingMgntService {
	@Autowired
private PersonRepo personRepo;
	@Override
	public String saveDataUsingParent(Person person) {
		// TODO Auto-generated method stub
		return personRepo.save(person).getPid()+"Person is saved";
	}

}
