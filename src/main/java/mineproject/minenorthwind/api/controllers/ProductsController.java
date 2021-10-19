package mineproject.minenorthwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mineproject.minenorthwind.business.abstracts.ProductService;
import mineproject.minenorthwind.core.utilities.DataResult;
import mineproject.minenorthwind.entities.concretes.Product;

@RestController
@RequestMapping("api/products")
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
	
	@GetMapping("/getByCategoryId")
	public DataResult<List<Product>> getByCategoryId(int categoryId){
		return this.productService.findByCategory_CategoryId(categoryId);
	}
	
	
}
