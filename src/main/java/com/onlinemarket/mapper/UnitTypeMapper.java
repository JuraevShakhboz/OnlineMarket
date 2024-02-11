package com.onlinemarket.mapper;

import com.onlinemarket.dto.unitType.UnitTypeDTO;
import com.onlinemarket.entity.UnitType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnitTypeMapper extends EntityMapper<UnitTypeDTO, UnitType>{
}
