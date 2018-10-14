package com.jnit.accessmodifiers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class AmMain {

 public static void main(String[] args) {
 List<List<String>> list = Arrays.asList(
         Arrays.asList("a"),
         Arrays.asList("b"));
 System.out.println(list);

  System.out.println(list
          .stream()
          .flatMap(Collection::stream)
          .collect(Collectors.toList()));


 }

 public static void main1(String[] args) {
   List<Product> productsList = new ArrayList<Product>();
   //Adding Products
   productsList.add(new Product(1, "HP Laptop", 25000f));
   productsList.add(new Product(2, "Dell Laptop", 30000f));
   productsList.add(new Product(3, "Lenevo Laptop", 28000f));
   productsList.add(new Product(4, "Sony Laptop", 28000f));
   productsList.add(new Product(5, "Apple Laptop", 90000f));
   List<Product> productPriceList2 = productsList.stream()
           .filter(p -> p.price > 30000)// filtering data
           //.map(p -> p.name)        // fetching names
           .collect(Collectors.toList()); // collecting as list
   System.out.println(productPriceList2);


  }
 }






class Product{
 int id;
 String name;
 float price;
 public Product(int id, String name, float price) {
  this.id = id;
  this.name = name;
  this.price = price;
 }
}
