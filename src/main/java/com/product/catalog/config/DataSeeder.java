//package com.product.catalog.config;
//
//import com.product.catalog.model.Category;
//import com.product.catalog.model.Product;
//import com.product.catalog.repository.CategoryRepository;
//import com.product.catalog.repository.ProductRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//public class DataSeeder implements CommandLineRunner {
//
//    private final ProductRepository productRepository;
//    private final CategoryRepository categoryRepository;
//
//    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
//        this.productRepository = productRepository;
//        this.categoryRepository = categoryRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        // Clear all existing data
//        productRepository.deleteAll();
//        categoryRepository.deleteAll();
//
//        // Create Categories
//        Category electronics = new Category();
//        electronics.setName("Electronics");
//
//        Category clothing = new Category();
//        clothing.setName("Clothing");
//
//        Category home = new Category();
//        home.setName("Home and Kitchen");
//
//        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));
//
//        // Create Products
//        Product phone = new Product();
//        phone.setName("Smartphone");
//        phone.setDescription("Latest model smartphone with advanced features.");
//        phone.setImageUrl("https://placehold.co/600x400");
//        phone.setPrice(1120.50);
//        phone.setCategory(electronics);
//
//
//        Product laptop = new Product();
//        laptop.setName("Laptop");
//        laptop.setDescription("High-performance laptop for professionals.");
//        laptop.setImageUrl("https://placehold.co/600x400");
//        laptop.setPrice(1500.00);
//        laptop.setCategory(electronics);
//
//        Product jacket = new Product();
//        jacket.setName("Leather Jacket");
//        jacket.setDescription("Stylish leather jacket for winter.");
//        jacket.setImageUrl("https://placehold.co/600x400");
//        jacket.setPrice(199.99);
//        jacket.setCategory(clothing);
//
//        Product blender = new Product();
//        blender.setName("Blender");
//        blender.setDescription("High-speed blender for smoothies and soups.");
//        blender.setImageUrl("https://placehold.co/600x400");
//        blender.setPrice(89.99);
//        blender.setCategory(home);
//
//        // Save Products
//        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));
//    }
//}
