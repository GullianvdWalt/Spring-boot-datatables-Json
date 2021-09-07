package com.gvdw.datatables_server_side.controllers;

import com.gvdw.datatables_server_side.models.Product;
import com.gvdw.datatables_server_side.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 12:00 on Sep, 2021
 */
@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = {"/products"})
    public String getProductPage(){
        return "products";
    }

    @GetMapping("/products/get-products")
    @ResponseBody
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
