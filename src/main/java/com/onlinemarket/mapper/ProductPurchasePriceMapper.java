package com.onlinemarket.mapper;

import com.onlinemarket.dto.productPurchasePrice.ProductPurchasePriceDTO;
import com.onlinemarket.entity.ProductPurchasePrice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductPurchasePriceMapper extends EntityMapper<ProductPurchasePriceDTO, ProductPurchasePrice>{
}
