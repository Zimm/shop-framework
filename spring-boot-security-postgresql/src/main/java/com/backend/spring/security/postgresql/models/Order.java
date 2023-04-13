package com.backend.spring.security.postgresql.models;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(	name = "orders")
public class Order {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @NotNull
    private long userid;


    @NotBlank
    @Column(columnDefinition="TEXT")
	private String products;

	public Order() {
	}

	public Order(long u, String product ) {
		this.userid = u;
        this.products = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public long getUser() { return userid;}

    public void setUser(long user) { this.userid = user;}

    public String getProducts() { return products;}

    public void setProducts(String products) {
        this.products = products;
    }
    
}

