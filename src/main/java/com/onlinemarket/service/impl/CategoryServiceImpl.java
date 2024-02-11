package com.onlinemarket.service.impl;

import com.onlinemarket.dto.category.CategoryDTO;
import com.onlinemarket.dto.category.CreateCategoryDTO;
import com.onlinemarket.dto.category.UpdateCategoryDTO;
import com.onlinemarket.entity.Category;
import com.onlinemarket.mapper.CategoryMapper;
import com.onlinemarket.repository.CategoryRepository;
import com.onlinemarket.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public CategoryDTO createCategory(CreateCategoryDTO createCategoryDTO) {
        Category category = new Category();
        category.setName(createCategoryDTO.getName());
        return categoryMapper.toDTO(categoryRepository.save(category));
    }

    @Override
    public CategoryDTO updateCategory(Long id,UpdateCategoryDTO updateCategoryDTO) {
        Category category = categoryRepository.getReferenceById(id);
        category.setName(updateCategoryDTO.getName());
        return categoryMapper.toDTO(categoryRepository.save(category));
    }

    @Override
    public CategoryDTO getCategoryById(Long id) {
        return categoryMapper.toDTO(categoryRepository.getReferenceById(id));
    }

    @Override
    public List<CategoryDTO> getCategoryList() {
        return categoryMapper.toDTOs(categoryRepository.findAll());
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }
}
