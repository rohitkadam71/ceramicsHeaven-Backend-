package com.ceramicsheaven.responses;


import com.ceramicsheaven.model.Size;

import java.util.HashSet;
import java.util.Set;

public class ProductRequest {
	
	private String title;
	
	private String discription;
	
	private int price;
	
	private int discountedPrice;
	
	private int discountedPersent;
	
	private int quantity;
	
	private String brand;
	
	private String color;
	
	private Set<Size> size = new HashSet<>();
	
	private String imageUrl;
	
	private String topLevelCategory;
	
	private String secondLevelCategory;
	
	private String thirdLevelCategory;
	
	

	public ProductRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductRequest(String title, String discription, int price, int discountedPrice, int discountedPersent,
                          int quantity, String brand, String color, Set<Size> size, String imageUrl, String topLevelCategory,
                          String secondLevelCategory, String thirdLevelCategory) {
		super();
		this.title = title;
		this.discription = discription;
		this.price = price;
		this.discountedPrice = discountedPrice;
		this.discountedPersent = discountedPersent;
		this.quantity = quantity;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.imageUrl = imageUrl;
		this.topLevelCategory = topLevelCategory;
		this.secondLevelCategory = secondLevelCategory;
		this.thirdLevelCategory = thirdLevelCategory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public int getDiscountedPersent() {
		return discountedPersent;
	}

	public void setDiscountedPersent(int discountedPersent) {
		this.discountedPersent = discountedPersent;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Set<Size> getSize() {
		return size;
	}

	public void setSize(Set<Size> size) {
		this.size = size;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTopLevelCategory() {
		return topLevelCategory;
	}

	public void setTopLevelCategory(String topLevelCategory) {
		this.topLevelCategory = topLevelCategory;
	}

	public String getSecondLevelCategory() {
		return secondLevelCategory;
	}

	public void setSecondLevelCategory(String secondLevelCategory) {
		this.secondLevelCategory = secondLevelCategory;
	}

	public String getThirdLevelCategory() {
		return thirdLevelCategory;
	}

	public void setThirdLevelCategory(String thirdLevelCategory) {
		this.thirdLevelCategory = thirdLevelCategory;
	}
	
	

}
