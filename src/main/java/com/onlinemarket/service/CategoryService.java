package com.onlinemarket.service;

import com.onlinemarket.dto.category.CategoryDTO;
import com.onlinemarket.dto.category.CreateCategoryDTO;
import com.onlinemarket.dto.category.UpdateCategoryDTO;

import java.util.List;

public interface CategoryService {
    CategoryDTO createCategory(CreateCategoryDTO createCategoryDTO);
    CategoryDTO updateCategory(Long id,UpdateCategoryDTO updateCategoryDTO);
    CategoryDTO getCategoryById(Long id);
    List<CategoryDTO> getCategoryList();
    void deleteCategoryById(Long id);
}
