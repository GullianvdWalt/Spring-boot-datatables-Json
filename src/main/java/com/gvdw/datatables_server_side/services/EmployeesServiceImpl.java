package com.gvdw.datatables_server_side.services;

import com.gvdw.datatables_server_side.models.Employees;
import com.gvdw.datatables_server_side.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 09:23 on Sep, 2021
 */
@Service("EmployeesService")
public class EmployeesServiceImpl implements EmployeesService{

    private final EmployeesRepository employeesRepository;

    @Autowired
    public EmployeesServiceImpl(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @Override
    public List<Employees> getAllEmployees() {
        return employeesRepository.findAll();
    }

    @Override
    public Employees findEmployeeById(Integer id) {
        return employeesRepository.getById(id);
    }
}
