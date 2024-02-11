package com.onlinemarket.service;

import com.onlinemarket.dto.productSellPrice.CreateProductSellPriceDTO;
import com.onlinemarket.dto.productSellPrice.ProductSellPriceDTO;
import com.onlinemarket.dto.productSellPrice.UpdateProductSellPriceDTO;
import com.onlinemarket.entity.Product;

import java.util.List;

public interface ProductSellPriceService {
    ProductSellPriceDTO createProductSellPrice(CreateProductSellPriceDTO createProductSellPriceDTO);
    ProductSellPriceDTO updateProductSellPriceById(Long id, UpdateProductSellPriceDTO updateProductSellPriceDTO);
    ProductSellPriceDTO updateProductSellPriceStatusByProduct(Product product);
    ProductSellPriceDTO getProductSellPriceById(Long id);
    ProductSellPriceDTO getProductSellPriceByProduct(Product product);
    List<ProductSellPriceDTO> getProductSellPriceListByProductAndStatus(Product product);
    List<ProductSellPriceDTO> getProductSellPriceList();
    void deleteProductSellPriceById(Long id);
}
