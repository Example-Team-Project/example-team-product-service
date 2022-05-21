package com.example.team.project.product.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "products")
public class ProductEntity extends PanacheEntityBase {
    @Id
    @Column(length = 20)
    public String id;
    @Column(name = "product_name")
    public String name;
    @Column(length = 100)
    public String brand;
    public String description;
    @Column(name = "list_price")
    public Double listPrice;
    @Column(name = "sell_price")
    public Double sellPrice;
    public boolean stock;
}
