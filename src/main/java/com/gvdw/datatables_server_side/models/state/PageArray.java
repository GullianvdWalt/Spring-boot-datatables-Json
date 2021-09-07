package com.gvdw.datatables_server_side.models.state;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 11:43 on Sep, 2021
 *
 * Class for jQuery DataTable,
 * to support arrays as a data source of DataTable component
 */
public class PageArray {
    private List<List<String>> data;
    private int recordsFiltered;
    private int recordsTotal;
    private int draw;

    public PageArray() {
    }

    public List<List<String>> getData() {
        return data;
    }

    public void setData(List<List<String>> data) {
        this.data = data;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}
