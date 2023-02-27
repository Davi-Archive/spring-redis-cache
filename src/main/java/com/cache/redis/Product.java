package com.cache.redis;

import java.util.Objects;

public class Product {
    private String id;
    private String name;

    public Product(String id, String name) {
	super();
	this.id = id;
	this.name = name;
    }

    public static Product newProd(String id,String name) {
	return new Product(id, name);
    }
    
    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public int hashCode() {
	return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Product other = (Product) obj;
	return Objects.equals(id, other.id)
		&& Objects.equals(name, other.name);
    }

}
