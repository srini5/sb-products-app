package com.flair.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flair.products.model.Category;
import com.flair.products.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@GetMapping("/categories/{cid}")
	public Category getCategory(@PathVariable String cid){
		return categoryService.getCategory(cid);
	}
	
	@PostMapping("/categories")
	public Category createCategory(@RequestBody Category category){
		return categoryService.createCategory(category);
	}
	
	@PutMapping("/categories/{cid}")
	public Category updateCategory(@PathVariable String cid, @RequestBody Category category){
		return categoryService.updateCategory(category);
	}
	
	@DeleteMapping("/categories/{cid}")
	public String removeCategory(@PathVariable String cid){
		return categoryService.deleteCategory(cid);
	}
	
}
