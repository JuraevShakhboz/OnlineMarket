package com.onlinemarket.mapper;

import com.onlinemarket.dto.category.CategoryDTO;
import com.onlinemarket.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDTO, Category> {
}
