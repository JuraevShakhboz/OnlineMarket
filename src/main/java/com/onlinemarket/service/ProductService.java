package com.onlinemarket.service;

import com.onlinemarket.dto.product.CreateProductDTO;
import com.onlinemarket.dto.product.ProductDTO;
import com.onlinemarket.dto.product.UpdateProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(CreateProductDTO createProductDTO);
    ProductDTO updateProductById(Long id, UpdateProductDTO updateProductDTO);
    ProductDTO getProductById(Long id);
    List<ProductDTO> getProductList();
    void deleteProductById(Long id);
}
