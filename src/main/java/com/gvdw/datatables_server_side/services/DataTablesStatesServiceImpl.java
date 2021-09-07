package com.gvdw.datatables_server_side.services;

import com.gvdw.datatables_server_side.models.DataTableStates;
import com.gvdw.datatables_server_side.repositories.DataTableStatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 15:41 on Sep, 2021
 */
@Service("DataTablesStatesService")
public class DataTablesStatesServiceImpl implements DataTablesStatesService{

    private final DataTableStatesRepository dataTableStatesRepository;

    @Autowired
    public DataTablesStatesServiceImpl(DataTableStatesRepository dataTableStatesRepository) {
        this.dataTableStatesRepository = dataTableStatesRepository;
    }

    @Override
    public void saveState(DataTableStates dataTablesState) {
        dataTableStatesRepository.save(dataTablesState);
    }

    @Override
    public DataTableStates findDataTableStates(Integer id) {
       return dataTableStatesRepository.getById(id);
    }

    @Override
    public List<DataTableStates> getDataTableStates() {
        return dataTableStatesRepository.findAll();
    }
}
