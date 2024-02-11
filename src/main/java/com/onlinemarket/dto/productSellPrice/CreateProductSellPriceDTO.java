package com.onlinemarket.dto.productSellPrice;

import com.onlinemarket.entity.Product;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateProductSellPriceDTO {
    Product product;
    Float price;
    Boolean status;
}
