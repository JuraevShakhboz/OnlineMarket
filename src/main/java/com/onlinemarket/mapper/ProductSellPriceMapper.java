package com.onlinemarket.mapper;

import com.onlinemarket.dto.productSellPrice.ProductSellPriceDTO;
import com.onlinemarket.entity.ProductSellPrice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductSellPriceMapper extends EntityMapper<ProductSellPriceDTO, ProductSellPrice>{
}
