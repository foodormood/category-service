package com.thetinydev.service;

import com.thetinydev.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category create(Category category);
}
