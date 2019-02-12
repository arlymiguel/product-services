package com.armifella.product.expose.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armifella.product.business.ProductService;
import com.armifella.product.model.Product;


/** * Project	: product-services 
	* @date		: 8 feb. 2019 
	* @time		: 11:43:31 
	* @author	: Arly Fernandez 
*/
@RequestMapping("/product-managment/v1/product")
@RestController
public class ProductController {

	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@CrossOrigin
	@GetMapping("")
	public List<Product> getAllProduct() {
		return productService.findAll();
	}
	
}
