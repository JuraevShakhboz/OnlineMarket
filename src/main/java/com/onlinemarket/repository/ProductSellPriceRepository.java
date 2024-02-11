package com.onlinemarket.repository;

import com.onlinemarket.entity.Product;
import com.onlinemarket.entity.ProductSellPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductSellPriceRepository extends JpaRepository<ProductSellPrice,Long> {
    List<ProductSellPrice> findProductSellPricesByProduct(Product product);
    List<ProductSellPrice> findProductSellPricesByProductAndStatusTrue(Product product);
}
