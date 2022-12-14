package Supermarket.Product;

import java.util.*;

public class Recipes {
    private HashMap<Product, Integer> someProducts;
    private float sumRecipe;
    private final String nameRecipe;


    public Recipes(String nameRecipe) {
        this.nameRecipe = nameRecipe;
        this.someProducts = new HashMap<>();
    }

    public void addRecipe(Set<Recipes> recipes) {
        if (recipes.contains(this)) {
            throw new RuntimeException("Рецепт уже есть в списке.");
        } else {
            recipes.add(this);
        }
    }

    public void addProductInRecipe(Product product, int count) {
        if (count <= 0) {
            count = 1;
        } else {
            someProducts.put(product, count);
        }
        System.out.println("добавляем: " + count + "шт. " + product.getName() + " в " + nameRecipe);
        sumRecipe += product.getCost() * count;
        System.out.println("Стоимость блюда: " + sumRecipe + " руб.");
    }

    public HashMap<Product, Integer> getSomeProducts() {
        return someProducts;
    }

    public void setSomeProducts(HashMap<Product, Integer> someProducts) {
        this.someProducts = someProducts;
    }

    public float getSumRecipe() {
        return sumRecipe;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Float.compare(recipes.sumRecipe, sumRecipe) == 0 && Objects.equals(someProducts, recipes.someProducts) && Objects.equals(nameRecipe, recipes.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(someProducts, sumRecipe, nameRecipe);
    }

    @Override
    public String toString() {
        return "Рецепт: " + nameRecipe +
                ". Список продуктов: " + someProducts +
                ", сумма рецепта: " + sumRecipe + ".";
    }
}
