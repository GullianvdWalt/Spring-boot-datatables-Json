package com.gvdw.datatables_server_side.services;

import com.gvdw.datatables_server_side.models.DataTableStates;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 15:41 on Sep, 2021
 */
public interface DataTablesStatesService {
    void saveState(DataTableStates dataTablesState);
    DataTableStates findDataTableStates(Integer id);
    List<DataTableStates> getDataTableStates();
    String getStateByProductId(int id);
}
