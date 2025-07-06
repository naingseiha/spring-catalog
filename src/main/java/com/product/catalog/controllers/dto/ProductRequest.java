package com.product.catalog.controllers.dto;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private String imageUrl;
    private Double price;
    private Long categoryId; // Assuming category is identified by ID
}
