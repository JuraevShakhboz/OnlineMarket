package com.onlinemarket.mapper;

import com.onlinemarket.dto.product.ProductDTO;
import com.onlinemarket.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product>{
}
