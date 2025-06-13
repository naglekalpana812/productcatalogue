package com.kalpana.projects.productcatalogue.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;
import java.util.Set;

@Getter
@Setter
@ToString
public class Product {
    private int id;
    private String name;
    private String cuisine;
    private String caloriesPerServing;
    private String image;
    private double rating;
    private int reviewCount;
    private Set<String> mealType;
    private Set<String> tags;
    private BigInteger price;
}
