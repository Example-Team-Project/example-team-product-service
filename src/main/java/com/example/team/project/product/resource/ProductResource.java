package com.example.team.project.product.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.team.project.product.repository.ProductEntity;
import com.example.team.project.product.resource.model.Product;
import com.example.team.project.product.resource.transformer.ProductResourceTransformer;
import com.example.team.project.product.service.ProductRetrieveService;

@Path("/v1/products")
public class ProductResource {

    private final ProductRetrieveService productRetrieveService;
    private final ProductResourceTransformer productResourceTransformer;

    public ProductResource(ProductRetrieveService productRetrieveService, ProductResourceTransformer productResourceTransformer) {
        this.productRetrieveService = productRetrieveService;
        this.productResourceTransformer = productResourceTransformer;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAll() {
        return getExampleProducts();
    }

    private List<Product> getExampleProducts() {
        return productRetrieveService.getAll().stream().map(productResourceTransformer::transformToResource).toList();
    }
}
