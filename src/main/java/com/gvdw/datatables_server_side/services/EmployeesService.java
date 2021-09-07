package com.gvdw.datatables_server_side.services;

import com.gvdw.datatables_server_side.models.Employees;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 09:23 on Sep, 2021
 */
public interface EmployeesService {
    List<Employees> getAllEmployees();
    Employees findEmployeeById(Integer id);
}
