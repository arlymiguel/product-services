package com.armifella.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.armifella.product.model.Product;


/** * Project	: product-services 
	* @date		: 8 feb. 2019 
	* @time		: 11:28:38 
	* @author	: Arly Fernandez 
*/
@Repository
public interface ProductJpaRepository extends JpaRepository<Product, Long> {

}
