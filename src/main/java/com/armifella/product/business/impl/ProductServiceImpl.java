package com.armifella.product.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armifella.product.business.ProductService;
import com.armifella.product.model.Product;
import com.armifella.product.repository.ProductJpaRepository;


/** * Project	: product-services 
	* @date		: 8 feb. 2019 
	* @time		: 11:28:45 
	* @author	: Arly Fernandez 
*/
@Service
public class ProductServiceImpl implements ProductService {

	private final ProductJpaRepository productJpaRepository;
	
	@Autowired
	public ProductServiceImpl(ProductJpaRepository productJpaRepository) {
		this.productJpaRepository = productJpaRepository;
	}
	
	@Override
	public List<Product> findAll() {
		return productJpaRepository.findAll();
	}

}
