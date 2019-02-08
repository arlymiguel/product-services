package com.armifella.product.business;

import java.util.List;

import com.armifella.product.model.Product;


/** * Project	: product-services 
	* @date		: 8 feb. 2019 
	* @time		: 11:26:15 
	* @author	: Arly Fernandez 
*/
public interface ProductService {

	List<Product> findAll();
	
}
