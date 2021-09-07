package com.gvdw.datatables_server_side.controllers;

import com.gvdw.datatables_server_side.models.DataTableStates;
import com.gvdw.datatables_server_side.models.Product;
import com.gvdw.datatables_server_side.services.DataTablesStatesService;
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
    private final DataTablesStatesService dataTableStatesService;

    @Autowired
    public ProductController(ProductService productService, DataTablesStatesService dataTableStatesService) {
        this.productService = productService;
        this.dataTableStatesService = dataTableStatesService;
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

    @PostMapping("/products/state_save")
    @ResponseBody
    public String saveTableState(@RequestParam("state") String state){
        List<Product> products = productService.getProducts();
        Product product = null;
        Integer id = 0;
        if(products.size() > 0){
            product = products.get(0);
//            product.setDataTableStates(null);
//            id = product.getDataTableStates().getId();
//            productService.save(product);
        }
        DataTableStates dataTableState = new DataTableStates();
//        if(id > 0){
//            dataTableState = dataTableStatesService.findDataTableStates(id);
//        }
        dataTableState.setStateJson(state);
        dataTableState.setProducts(product);
        dataTableStatesService.saveState(dataTableState);

        return "success";
    }

    @GetMapping("/products/state_load")
    @ResponseBody
    public String loadTableState(){
        DataTableStates dataTableState = dataTableStatesService.findDataTableStates(2);
        return dataTableState.getStateJson() != null ? dataTableState.getStateJson(): "";
    }
}
