package com.codegnan.cruddemo.service;

import java.util.List;

import com.codegnan.cruddemo.entity.Product;
import com.codegnan.cruddemo.exception.ProductIdNotFoundException;

public interface ProductService {

	
	public List<Product> findAllProducts();
	public Product findProductById(int productId) throws ProductIdNotFoundException;
	public Product addProduct(Product product);
	public Product updateProduct(int productId,Product product) throws ProductIdNotFoundException;
	public void deleteProduct(int productId)throws ProductIdNotFoundException;
	
		
	
}
