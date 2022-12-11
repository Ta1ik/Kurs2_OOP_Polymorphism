package Supermarket.Product;

import java.util.Objects;
import java.util.Set;

public class Product {
    private final String name;
    private float cost;
    private float weight;

    public Product(String name, float cost, float weight) {
        if (cost <= 0 || weight <= 0 || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        } else {
            this.cost = cost;
            this.weight = weight;
            this.name = name;
        }
    }
    public void addProducts(Set<Product> products){
        if(products.contains(this)){
            throw new RuntimeException("Продукт уже в списке! Удалите повторяющийся продукт.");
        } else {
            products.add(this);
        }
    }
    public void removeProducts(Set<Product> products){
        if(this == null){
            throw new RuntimeException("Товар уже куплен!");
        } else {
            products.remove(this);
        }
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Название: " + name + ". Стоимость: " + cost + ", Вес: " + weight;
    }
}
