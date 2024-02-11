package com.onlinemarket.dto.productSellPrice;

import com.onlinemarket.entity.Product;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateProductSellPriceDTO {
    Product product;
    Float price;
    Timestamp timestamp;
}
