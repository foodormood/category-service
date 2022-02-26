package com.thetinydev.service.impl;

import com.thetinydev.model.Category;
import com.thetinydev.repository.CategoryRepository;
import com.thetinydev.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getById(UUID id) {
        return categoryRepository.getById(id);
    }
}
