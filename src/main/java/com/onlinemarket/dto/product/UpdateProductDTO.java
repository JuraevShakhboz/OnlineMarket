package com.onlinemarket.dto.product;

import com.onlinemarket.entity.Category;
import com.onlinemarket.entity.UnitType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateProductDTO {
    String name;
    UnitType unitType;
    Category category;
}
