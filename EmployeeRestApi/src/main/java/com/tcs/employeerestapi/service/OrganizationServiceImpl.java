package com.tcs.employeerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employeerestapi.model.Organization;
import com.tcs.employeerestapi.repository.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService {


	@Autowired
	OrganizationRepository organizationRepository;
	
	
	@Override
	public String addOrganization(Organization organization) {
	Organization organization2 = null;
		try {
			organization2 = organizationRepository.save(organization);
			return "success";
		}catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
		
		

	
	}

	@Override
	public String updateOrganization(Organization organization) {
		return null;
		
	}

	@Override
	public String deleteOrganization(int id) {
		return null;
	}

	@Override
	public Optional<Organization> findById(int id) {
		return null;
	}

	@Override
	public Optional<List<Organization>> getOrganization() {
		return null;
	}

	

}
