package Supermarket.Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {
    private Set <Product> someProducts;
    private float sumRecipe;
    private final String nameRecipe;


    public Recipes(String nameRecipe) {
        this.nameRecipe = nameRecipe;
        this.someProducts = new HashSet<>();
    }
    public void addRecipe(Set<Recipes> recipes){
        if(recipes.contains(this)){
            throw new RuntimeException("Рецепт уже есть в списке.");
        } else {
            recipes.add(this);
        }
    }

    public void addProductInRecipe(Product ... products){
        someProducts.addAll(Arrays.asList(products));
        System.out.println("Рецепт: " + nameRecipe);
        for (Product product: products) {
            System.out.println("добавляем: " + product.getName());
            sumRecipe += product.getCost();
        }
        System.out.println("Стоимость нашего блюда: " +sumRecipe + " руб.");
    }

    public Set<Product> getSomeProducts() {
        return someProducts;
    }

    public void setSomeProducts(Set<Product> someProducts) {
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
