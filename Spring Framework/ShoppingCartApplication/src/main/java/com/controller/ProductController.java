package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
@RequestMapping("/products/")
public class ProductController {
	
	@Autowired
	ProductService productService;
		
		@GetMapping("showForm")
		public String showProuctForm(Product product) {
			return "add-product.html";
		}

		@GetMapping(value = "getAllProducts")
		public List<Product> getAllProducts() {
		return productService.getAlProducts();
		}
		// http://localhost:8080/products/storeProduct
		@PostMapping(value="storeProduct")
		public String storeProduct(@RequestBody Product pro) {
			return productService.storeProduct(pro);
		}
		// http://localhost:8080/products/updateProduct
		@PutMapping(value = "updateProduct")
		public String updateProduct(@RequestBody Product pro) {
			return productService.updateProduct(pro);
		}
		// http://localhost:8080/products/deleteProduct/1
		@DeleteMapping(value = "deleteProduct/{id}")
		public String deleteProduct(@PathVariable("id") int id) {
			return productService.deleteProduct(id);
		}

	
}
