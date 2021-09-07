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

    public Employees() {
    }

    public Employees(Integer id, String name, String surname, String idNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
