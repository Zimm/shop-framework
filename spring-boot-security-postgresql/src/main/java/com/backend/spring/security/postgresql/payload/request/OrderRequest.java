package com.backend.spring.security.postgresql.payload.request;


import javax.validation.constraints.*;
 
public class OrderRequest {

    @NotBlank
	private String products;

    @NotNull
    private long userid;
   
    public String getProducts() { return products;}

    public void setProducts(String products) {
        this.products = products;
    }

    public long getUser() { return userid;}

    public void setuser(long user) {
        this.userid = user;
    }
    
}
