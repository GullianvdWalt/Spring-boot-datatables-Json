package com.gvdw.datatables_server_side.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Gullian Van Der Walt
 * Created at 08:11 on Sep, 2021
 */
@Entity
@Getter
@Setter
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

    public Product() {
    }

    public Product(int id, String name, String description, String brand, double price, int units) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.units = units;
    }

}
