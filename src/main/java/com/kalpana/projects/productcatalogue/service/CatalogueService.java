package com.kalpana.projects.productcatalogue.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kalpana.projects.productcatalogue.dto.ProductCatalogue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class CatalogueService {

    @Autowired
    private ObjectMapper objectMapper;

    public ProductCatalogue fetchAllCatalogue() {

        ProductCatalogue item = new ProductCatalogue();
        try {
            // Read JSON file and convert to Java Object
            item = objectMapper.readValue(new File("src/main/resources/catalogue.json"), ProductCatalogue.class);
            System.out.println("items are "+item);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return item;
    }
}
