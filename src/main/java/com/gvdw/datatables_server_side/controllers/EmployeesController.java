package com.gvdw.datatables_server_side.controllers;

import com.gvdw.datatables_server_side.models.Employees;
import com.gvdw.datatables_server_side.models.Product;
import com.gvdw.datatables_server_side.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 14:14 on Sep, 2021
 */
@Controller
public class EmployeesController {
    private final EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping(value = {"/employees"})
    public String getEmployeesPage(){
        return "employees";
    }

    @GetMapping("/employees/get-employees")
    @ResponseBody
    public List<Employees> getEmployees(){
        return employeesService.getAllEmployees();
    }
}
