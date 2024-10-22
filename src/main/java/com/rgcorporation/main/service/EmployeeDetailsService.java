package com.rgcorporation.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgcorporation.main.model.EmployeeDetails;
import com.rgcorporation.main.repository.EmployeeDetailsRepositoryInterface;

@Service
public class EmployeeDetailsService implements EmployeeDetailsServiceInterface{

	@Autowired
	EmployeeDetailsRepositoryInterface employeeDetailsRepository;
//
//	@Override
//	public boolean addNewEmployee(EmployeeDetails employeeDetails) {
//		return employeeDetailsRepository.addNewEmployee(employeeDetails);
//	}
//
//	@Override
//	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails) {
//		return employeeDetailsRepository.updateEmployeeDetails(employeeDetails);
//	}
//
//	@Override
//	public boolean deleteEmployeeByEmployeeId(int employeeId) {
//		return employeeDetailsRepository.deleteEmployeeByEmployeeId(employeeId);
//	}

	@Override
	public EmployeeDetails getEmployeeByEmployeeId(int employeeId) {
		return employeeDetailsRepository.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<EmployeeDetails> getAllEmployees() {
		return employeeDetailsRepository.getAllEmployees();
	}

	@Override
	public EmployeeDetails getEmployeeByloginId(int loginId) {
		return employeeDetailsRepository.getEmployeeByloginId(loginId);
	}

	@Override
	public EmployeeDetails getDetailsByRequstId(int travelRequestId) {
		return employeeDetailsRepository.getDetailsByRequstId(travelRequestId);
	}

}