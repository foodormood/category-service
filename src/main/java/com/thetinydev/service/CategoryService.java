package com.thetinydev.service;

import com.thetinydev.model.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<Category> findAll();
    Category create(Category category);
    Category getById(UUID id);
}
