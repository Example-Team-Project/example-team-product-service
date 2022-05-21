package com.example.team.project.product.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.team.project.product.repository.ProductEntity;
import com.example.team.project.product.resource.model.Product;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@ApplicationScoped
public class ProductRetrieveService {

    public List<ProductEntity> getAll() {
        return ProductEntity.listAll();
    }

}
