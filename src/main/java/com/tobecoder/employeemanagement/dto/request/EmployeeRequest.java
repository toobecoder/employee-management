package com.tobecoder.employeemanagement.dto.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class EmployeeRequest implements Serializable {
    private String name;
    private String gender;
    private Date dob;
    private String address;
}
