package com.gvdw.datatables_server_side.repositories;

import com.gvdw.datatables_server_side.models.DataTableStates;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gullian Van Der Walt
 * Created at 15:41 on Sep, 2021
 */
public interface DataTableStatesRepository extends JpaRepository<DataTableStates, Integer> {
}
