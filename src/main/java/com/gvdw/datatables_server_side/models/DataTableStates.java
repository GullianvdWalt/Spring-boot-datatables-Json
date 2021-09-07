package com.gvdw.datatables_server_side.models;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
}

