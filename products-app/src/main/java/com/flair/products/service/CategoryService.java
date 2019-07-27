package com.flair.products.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flair.products.model.Category;
import com.flair.products.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

//	private List<Category> categories = new ArrayList<Category>(
//			Arrays.asList(
//		new Category("dairy", "Dairy products"),
//		new Category("breakfast", "Breakfast products"),
//		new Category("flour", "Flours of different grains")
//		));

	public List<Category> getAllCategories() {
		
		List<Category> categories = new ArrayList<>();
		categoryRepository.findAll().forEach(categories::add);;
		return categories;
	}

	public Category getCategory(String cid) {
		return categoryRepository.findById(cid).get();
	}

	public Category createCategory(Category category) {
		categoryRepository.save(category);
		return category;
	}

	public Category updateCategory(Category category) {
		categoryRepository.save(category);
		return category;
	}
	
	public String deleteCategory(String cid) {
		categoryRepository.deleteById(cid);
		return "category with name:" + cid + " deleted";
	}
	
	
}
