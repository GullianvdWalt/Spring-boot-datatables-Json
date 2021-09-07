package com.gvdw.datatables_server_side.repositories;

import com.gvdw.datatables_server_side.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gullian Van Der Walt
 * Created at 08:41 on Sep, 2021
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
