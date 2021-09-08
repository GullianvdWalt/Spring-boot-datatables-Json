package com.gvdw.datatables_server_side.controllers;

import com.gvdw.datatables_server_side.models.DataTableStates;
import com.gvdw.datatables_server_side.models.Product;
import com.gvdw.datatables_server_side.services.DataTablesStatesService;
import com.gvdw.datatables_server_side.services.ProductService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.json.JSONObject;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView getProductPage(){
        ModelAndView model = new ModelAndView();
        model.setViewName("products");
        model.addObject("state", dataTableStatesService.getStateByProductId(productService.getProducts().get(0).getId()));
        return model;
    }

    @GetMapping("/products/get-products")
    @ResponseBody
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping("/products/state_save")
    @ResponseBody
    public String saveTableState(@RequestParam("state") String state){
        Product product = productService.getProducts().get(0);
        DataTableStates dataTableState = new DataTableStates();
        if(product.getDataTableStates() != null){
            dataTableState = product.getDataTableStates();
        }
        dataTableState.setProducts(product);
        dataTableState.setStateJson(state);
        dataTableStatesService.saveState(dataTableState);
        return "success";
    }

    @GetMapping("/products/state_load")
    @ResponseBody
    public String loadTableState(){
        DataTableStates dataTableState = dataTableStatesService.getDataTableStates().get(0);
        return dataTableState.getStateJson() != null ? dataTableState.getStateJson() : "";
    }
}
