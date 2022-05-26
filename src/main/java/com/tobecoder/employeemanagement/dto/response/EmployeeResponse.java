package com.tobecoder.employeemanagement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse implements Serializable {
    private Long id;
    private String name;
    private String gender;
    private Date dob;
    private String address;
}
