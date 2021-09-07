package com.gvdw.datatables_server_side.repositories;

import com.gvdw.datatables_server_side.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gullian Van Der Walt
 * Created at 09:08 on Sep, 2021
 */
public interface EmployeesRepository extends JpaRepository<Employees, Integer>{
}
