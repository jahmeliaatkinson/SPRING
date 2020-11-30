package com.tcs.employeerestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.employeerestapi.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

}
