package com.kalpana.projects.productcatalogue.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ProductCatalogue {
    private List<Product> recipes;
}
