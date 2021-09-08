package com.gvdw.datatables_server_side.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;

import javax.persistence.*;

/**
 * @author Gullian Van Der Walt
 * Created at 13:54 on Sep, 2021
 */
@AllArgsConstructor
@Entity
@Table(name = "data_table_state")
public class DataTableStates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "data_table_state_id")
    private Integer id;

    @Lob
    @Column(name = "state_json")
    private String stateJson;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "data_table_sate_products",
                joinColumns = { @JoinColumn(name = "data_table_state_id", referencedColumnName = "data_table_state_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id", referencedColumnName = "product_id") })
    @JsonIgnore
    private Product products;

    public DataTableStates() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStateJson() {
        return stateJson;
    }

    public void setStateJson(String stateJson) {
        this.stateJson = stateJson;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }
}

