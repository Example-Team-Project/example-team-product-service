package com.example.team.project.product.resource;

import static io.restassured.RestAssured.given;

import java.util.List;

import com.example.team.project.product.repository.ProductEntity;
import com.example.team.project.product.resource.model.Product;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class ProductResourceTest {

    @Test
    void testGetAllProducts() {

        var result = given().when().get("/v1/products").then().statusCode(200).extract().as(Product[].class);

        var expected = new Product[]{
                new Product("ID1", "Example Product 1", "Example Brand", "Description", 33.55, 30.32, true),
                new Product("ID2", "Example Product 2", "Brand of Example", "Description 2", 41.33, 36.93, false)
        };
        MatcherAssert.assertThat(result, Matchers.arrayWithSize(2));
        MatcherAssert.assertThat(result, Matchers.arrayContainingInAnyOrder(expected));
    }

}