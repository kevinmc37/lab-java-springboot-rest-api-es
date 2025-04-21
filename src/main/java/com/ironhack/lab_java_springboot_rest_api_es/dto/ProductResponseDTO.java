package com.ironhack.lab_java_springboot_rest_api_es.dto;

public class ProductResponseDTO {
    private Long id;
    private String name;
    private String category;
    private double price;
    private int quantity;

    public ProductResponseDTO() {}

    public ProductResponseDTO(Long id, String name, String category, double price, int quantity) {
        setId(id);
        setName(name);
        setCategory(category);
        setPrice(price);
        setQuantity(quantity);
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
}
