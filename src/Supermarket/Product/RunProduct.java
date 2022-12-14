package Supermarket.Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RunProduct {
    public static void main (String [] args) {

        //Hw #1

        Product banana = new Product("банан",79, 2.5f);
        Product apple = new Product("€блоко",120.5f, 4);
        Product potato = new Product("картофель",47.75f, 11.2f);
        Product juice = new Product("сок",140, 1);
        Product eggs = new Product("€йца",107.25f, 0.7f);
        Product floor = new Product("мука",122.5f, 2);
        Product water = new Product("вода",40.99f, 1);

        Set<Product> products = new HashSet<>();
        banana.addProducts(products);
        apple.addProducts(products);
        potato.addProducts(products);
        juice.addProducts(products);
        eggs.addProducts(products);

        System.out.println(products);

        eggs.removeProducts(products);

        System.out.println(products);
        separator();

        //Hw #2

        Recipes pie = new Recipes("ѕирог");
        pie.addProductInRecipe(potato, 4);
        pie.addProductInRecipe(water, 1);
        pie.addProductInRecipe(floor,1);
        pie.addProductInRecipe(eggs,2);
        separator();
        Recipes fresh = new Recipes("‘реш");
        fresh.addProductInRecipe(banana,2);
        fresh.addProductInRecipe(apple,2);
        fresh.addProductInRecipe(juice,1);
        separator();
        Recipes limonade = new Recipes("Ћимонад");
        limonade.addProductInRecipe(banana,2);
        limonade.addProductInRecipe(apple,2);
        limonade.addProductInRecipe(juice,1);
        Set<Recipes> allRecipes = new HashSet<>();
        pie.addRecipe(allRecipes);
        fresh.addRecipe(allRecipes);
        limonade.addRecipe(allRecipes);
        System.out.println(fresh.equals(limonade));
        separator();


    }

    public static void separator(){
        System.out.println("################################");
    }
}
