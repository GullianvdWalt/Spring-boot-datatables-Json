package com.gvdw.datatables_server_side.models.state;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 11:43 on Sep, 2021
 *
 * Class for jQuery DataTable,
 * wrapper class that wraps the result of a data list with metadata total records numner
 */
public class Page<T> {

    private List<T> data;
    private int recordsFiltered;
    private int recordsTotal;
    private int draw;

    public Page(List<T> data) {
        this.data = data;
    }

}
