package com.onlinemarket.service.impl;

import com.onlinemarket.dto.product.CreateProductDTO;
import com.onlinemarket.dto.product.ProductDTO;
import com.onlinemarket.dto.product.UpdateProductDTO;
import com.onlinemarket.entity.Product;
import com.onlinemarket.mapper.ProductMapper;
import com.onlinemarket.repository.ProductRepository;
import com.onlinemarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public ProductDTO createProduct(CreateProductDTO createProductDTO) {
        Product product = new Product();
        product.setName(createProductDTO.getName());
        product.setCategory(createProductDTO.getCategory());
        product.setUnitType(createProductDTO.getUnitType());
        product.setTotalAmount(createProductDTO.getTotalAmount());
        return productMapper.toDTO(productRepository.save(product));
    }

    @Override
    public ProductDTO updateProductById(Long id, UpdateProductDTO updateProductDTO) {
        Product product = productRepository.getReferenceById(id);
        product.setName(updateProductDTO.getName());
        product.setCategory(updateProductDTO.getCategory());
        product.setUnitType(updateProductDTO.getUnitType());
        return productMapper.toDTO(productRepository.save(product));
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return productMapper.toDTO(productRepository.getReferenceById(id));
    }

    @Override
    public List<ProductDTO> getProductList() {
        return productMapper.toDTOs(productRepository.findAll());
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
