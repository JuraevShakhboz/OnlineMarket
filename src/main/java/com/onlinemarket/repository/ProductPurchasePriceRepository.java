package com.onlinemarket.repository;

import com.onlinemarket.entity.Product;
import com.onlinemarket.entity.ProductPurchasePrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductPurchasePriceRepository extends JpaRepository<ProductPurchasePrice,Long> {
    List<ProductPurchasePrice> findProductPurchasePricesByProduct(Product product);
    List<ProductPurchasePrice> findProductPurchasePricesByProductAndStatusTrue(Product product);
}
