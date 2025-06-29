package com.kalpana.projects.productcatalogue.controller;

import com.kalpana.projects.productcatalogue.dto.ProductCatalogue;
import com.kalpana.projects.productcatalogue.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/productcatalogue")
public class ProductCatalogueController {

    @Autowired
    private CatalogueService catalogueService;

    @GetMapping
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public ProductCatalogue fetchProductCatalogue(){
        return catalogueService.fetchAllCatalogue();
    }

}
