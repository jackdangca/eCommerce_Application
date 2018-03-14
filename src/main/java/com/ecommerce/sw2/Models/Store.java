package com.ecommerce.sw2.Models;

import javax.persistence.Entity;

@Entity
public class Store {
    @javax.persistence.Id
    String name;
    String storeOwner;

    public Store() {}


    public Store(String name, String storeOwner) {
        this.name = name;
        this.storeOwner = storeOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(String storeOwner) {
        this.storeOwner = storeOwner;
    }
}
