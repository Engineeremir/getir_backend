package mineproject.minenorthwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mineproject.minenorthwind.business.abstracts.CategoryService;
import mineproject.minenorthwind.core.utilities.DataResult;
import mineproject.minenorthwind.entities.concretes.Category;



@RestController
@RequestMapping("/api/categories")
@CrossOrigin
public class CategoriesController {
	
	private CategoryService categoryService;
	
	@Autowired
	public CategoriesController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Category>> getAll(){
		return this.categoryService.getAll();
	}
	

}
