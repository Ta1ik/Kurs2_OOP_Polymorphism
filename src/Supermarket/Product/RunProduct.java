package Supermarket.Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RunProduct {
    public static void main (String [] args) {

        //Hw #1

        Product banana = new Product("�����",79, 2.5f);
        Product apple = new Product("������",120.5f, 4);
        Product potato = new Product("���������",47.75f, 11.2f);
        Product juice = new Product("���",140, 1);
        Product eggs = new Product("����",107.25f, 0.7f);
        Product floor = new Product("����",122.5f, 2);
        Product water = new Product("����",40.99f, 1);

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

        Recipes pie = new Recipes("�����");
        pie.addProductInRecipe(potato,water,floor,eggs);
        separator();
        Recipes fresh = new Recipes("����");
        fresh.addProductInRecipe(banana,apple,juice);
        separator();
        Recipes limonade = new Recipes("�������");
        limonade.addProductInRecipe(banana,apple,juice);
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
