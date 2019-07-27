package com.flair.products.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flair.products.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, String> {
}
