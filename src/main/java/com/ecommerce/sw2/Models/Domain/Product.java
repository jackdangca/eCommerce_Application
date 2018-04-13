package com.ecommerce.sw2.Models.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id" , nullable = false , updatable = false)
    private Long id;

    @Column(name = "price" , nullable = false)
    private float price;

    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name = "views", nullable = false)
    private int view;

    @Column(name = "no_of_items" , nullable = false)
    private int no_of_items;

    @ManyToOne(optional = false)
    @JsonBackReference
    private Store mystore;

    public Product() {
        this.view = 0;
    }

    public int getNo_of_items() {
        return no_of_items;
    }

    public void setNo_of_items(int no_of_items) {
        this.no_of_items = no_of_items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public Store getMystore() {
        return mystore;
    }

    public void setMystore(Store mystore) {
        this.mystore = mystore;
    }


}
