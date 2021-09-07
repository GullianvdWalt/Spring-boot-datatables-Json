package com.gvdw.datatables_server_side.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Gullian Van Der Walt
 * Created at 09:06 on Sep, 2021
 */
@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer id;
    private String name;
    private String surname;
    @Column(name = "id_number")
    private String idNumber;
}
