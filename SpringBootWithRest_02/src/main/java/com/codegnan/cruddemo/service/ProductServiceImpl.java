package com.codegnan.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codegnan.cruddemo.entity.Product;
import com.codegnan.cruddemo.exception.ProductIdNotFoundException;
import com.codegnan.cruddemo.repo.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

	
	public ProductRepository productRepository;
	

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product findProductById(int productId) throws ProductIdNotFoundException {
		Optional<Product> optProduct=productRepository.findById(productId);
		if(!optProduct.isPresent()) {
			throw new ProductIdNotFoundException();
		}
		return optProduct.get();
	}

	@Override
	public Product addProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(int productId, Product product) throws ProductIdNotFoundException {
		Optional<Product> optProduct=productRepository.findById(productId);
		if(!optProduct.isPresent()) {
			throw new ProductIdNotFoundException();
		}
		Product existedProduct=optProduct.get();
		existedProduct.setId(productId);
		
		return productRepository.save(existedProduct);
	}

	@Override
	public void deleteProduct(int productId) throws ProductIdNotFoundException {
		Optional<Product> optProduct=productRepository.findById(productId);
		if(!optProduct.isPresent()) {
			throw new ProductIdNotFoundException();
		}
		 productRepository.deleteById(productId);
		
	}

}
