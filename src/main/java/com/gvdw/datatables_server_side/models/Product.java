package com.gvdw.datatables_server_side.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Gullian Van Der Walt
 * Created at 08:11 on Sep, 2021
 */
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;
    private String name;
    private String description;
    private String brand;
    private Double price;
    private Integer units;

    @OneToOne(mappedBy = "products")
    @JsonIgnore
    private DataTableStates dataTableStates;

    public Product() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public DataTableStates getDataTableStates() {
        return dataTableStates;
    }

    public void setDataTableStates(DataTableStates dataTableStates) {
        this.dataTableStates = dataTableStates;
    }
}
