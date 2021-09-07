package com.gvdw.datatables_server_side.controllers;

import com.gvdw.datatables_server_side.models.Product;
import com.gvdw.datatables_server_side.services.EmployeesService;
import com.gvdw.datatables_server_side.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 07:52 on Sep, 2021
 */
@Controller
public class IndexController {

    private final ProductService productService;
    private final EmployeesService employeesService;

    @Autowired
    public IndexController(ProductService productService, EmployeesService employeesService) {
        this.productService = productService;
        this.employeesService = employeesService;
    }

    @GetMapping(value = {"/", "/index"})
    public String mainPage(){
        return "index";
    }

    @GetMapping("/products")
    @ResponseBody
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
