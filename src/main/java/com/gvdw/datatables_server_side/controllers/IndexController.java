package com.gvdw.datatables_server_side.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Gullian Van Der Walt
 * Created at 07:52 on Sep, 2021
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/", "/index"})
    public String mainPage(){
        return "index";
    }

}
