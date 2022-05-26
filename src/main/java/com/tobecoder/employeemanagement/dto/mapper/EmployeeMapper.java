package com.tobecoder.employeemanagement.dto.mapper;

import com.tobecoder.employeemanagement.dto.response.EmployeeResponse;
import com.tobecoder.employeemanagement.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
    EmployeeResponse bindDataEntityToResponse(EmployeeEntity employeeEntity);
    List<EmployeeResponse> bindDataListToResponseList(List<EmployeeEntity> employeeEntities);
}
