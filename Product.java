package com.jpaproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producttab")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	
	@Column(name = "pname")
	protected String pname;
	
	@Column(name = "supplier")
	protected String supplier;
	
	@Column(name = "stock")
	protected int stock;
	
	@Column(name = "price")
	protected double price;

	public Product() {
	}

	public Product(int id, String pname, String supplier, int stock, double price) {
		super();
		this.id = id;
		this.pname = pname;
		this.supplier = supplier;
		this.stock = stock;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", supplier=" + supplier + ", stock=" + stock + ", price="
				+ price + "]";
	}

}
