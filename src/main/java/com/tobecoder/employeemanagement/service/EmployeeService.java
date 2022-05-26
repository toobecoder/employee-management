package com.tobecoder.employeemanagement.service;

import com.tobecoder.employeemanagement.dto.request.EmployeeRequest;
import com.tobecoder.employeemanagement.dto.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    EmployeeResponse findEmployeeById(Long id);
    List<EmployeeResponse> findEmployeeList();
    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);
    EmployeeResponse updateEmployee(Long id, EmployeeRequest employeeRequest);
    void deleteEmployeeById(Long id);
}
