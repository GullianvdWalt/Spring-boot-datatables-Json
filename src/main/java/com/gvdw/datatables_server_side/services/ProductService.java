package com.gvdw.datatables_server_side.services;

import com.gvdw.datatables_server_side.models.Product;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 09:22 on Sep, 2021
 */
public interface ProductService {
    List<Product> getProducts();
    Product getProductById(Integer id);
}
