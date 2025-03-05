package com.codegnan.cruddemo.rest;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegnan.cruddemo.entity.Product;
import com.codegnan.cruddemo.exception.ProductIdNotFoundException;
import com.codegnan.cruddemo.service.ProductService;

@RestController
@RequestMapping("/api/products/")
public class ProductRestController {

    private final ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/products/")
    public List<Product> getAllProduct(){
        return productService.findAllProducts();
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
    	product.setId(0);
    	Product dbProduct=productService.addProduct(product);
		return dbProduct;
    	
    }
    @GetMapping("{productId}")
    public Product findProductById(@PathVariable int productId) throws ProductIdNotFoundException {
		
    	
    	return productService.findProductById(productId);
    	
    	
    }
    @PutMapping("{productId}")
    public Product updateProduct(@PathVariable int productId,@RequestBody Product product) throws ProductIdNotFoundException {
    	Product product1=productService.findProductById(productId);
    	product1.setName(product.getName());
    	product1.setPrice(product.getPrice());
		return productService.addProduct(product1);
    	
    }
    @DeleteMapping("{productId}")
    public String deleteProduct(@PathVariable int productId) throws ProductIdNotFoundException {
    	Product product=productService.findProductById(productId);
    	if(product==null) {
    		System.out.println("Product id not found");
    	}
		productService.deleteProduct(productId);
		return "deleted id is "+productId;
    	
    }
}
