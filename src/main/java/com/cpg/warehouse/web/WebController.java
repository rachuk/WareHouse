package com.cpg.warehouse.web;

import com.cpg.warehouse.dto.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/public")
public class WebController {

    @PostMapping("/create")
    @ResponseBody
    public Product createProduct(@RequestBody Product product) {
        // custom logic
        return product;
    }
    @GetMapping("/get")
    @ResponseBody
    public String testGet() {
        // custom logic
        return "sdfsd";
    }
}
