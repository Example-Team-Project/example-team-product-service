package com.example.team.project.product.resource.model;

public record Product(String id, String name, String brand, String description, Double listPrice, Double sellPrice, boolean inStock) {}
