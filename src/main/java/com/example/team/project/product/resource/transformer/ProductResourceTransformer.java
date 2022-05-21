package com.example.team.project.product.resource.transformer;

import javax.enterprise.context.ApplicationScoped;

import com.example.team.project.product.repository.ProductEntity;
import com.example.team.project.product.resource.model.Product;

@ApplicationScoped
public class ProductResourceTransformer {
    public Product transformToResource(ProductEntity productEntity) {
        return new Product(productEntity.id, productEntity.name, productEntity.brand, productEntity.description, productEntity.listPrice, productEntity.sellPrice, productEntity.stock);
    }
}
