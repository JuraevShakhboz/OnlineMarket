package com.onlinemarket.service;

import com.onlinemarket.dto.productPurchasePrice.CreateProductPurchasePriceDTO;
import com.onlinemarket.dto.productPurchasePrice.ProductPurchasePriceDTO;
import com.onlinemarket.dto.productPurchasePrice.UpdateProductPurchasePriceDTO;
import com.onlinemarket.entity.Product;

import java.util.List;

public interface ProductPurchasePriceService {
    ProductPurchasePriceDTO createProductPurchasePrice(CreateProductPurchasePriceDTO createProductBuyPriceDTO);
    ProductPurchasePriceDTO updateProductPurchasePriceById(Long id, UpdateProductPurchasePriceDTO updateProductBuyPriceDTO);
    ProductPurchasePriceDTO updateProductPurchasePriceStatusByProduct(Product product);
    ProductPurchasePriceDTO getProductPurchasePriceById(Long id);
    ProductPurchasePriceDTO getProductPurchasePriceByProduct(Product product);
    List<ProductPurchasePriceDTO> getProductPurchasePriceList();
    List<ProductPurchasePriceDTO> getProductPurchaseListPriceByProductAndStatus(Product product);
    void deleteProductPurchasePriceById(Long id);
}
