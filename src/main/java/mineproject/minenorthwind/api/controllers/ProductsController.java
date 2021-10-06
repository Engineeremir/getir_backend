package mineproject.minenorthwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mineproject.minenorthwind.business.abstracts.ProductService;
import mineproject.minenorthwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productServivce;

	@Autowired
	public ProductsController(ProductService productServivce) {
		super();
		this.productServivce = productServivce;
	}
	
	@GetMapping("get")
	public List<Product> getAll() {
		return this.productServivce.getAll();
	}
	
}
