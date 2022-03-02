package com.thetinydev.api;

import com.thetinydev.common.Response;
import com.thetinydev.model.Category;
import com.thetinydev.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/all")
    public Response<?> findAll(Pageable pageable) {
        return Response.toPage(categoryService.findAll(pageable));
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<?> fetchId(@PathVariable UUID id) {
        var cat = categoryService.getById(id);
        if (cat == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(cat);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.create(category));
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.create(category));
    }
}
