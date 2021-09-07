package com.gvdw.datatables_server_side.services;

import com.gvdw.datatables_server_side.models.Product;
import com.gvdw.datatables_server_side.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 09:23 on Sep, 2021
 */
@Slf4j
@Service("ProductService")
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.getById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

}
