package com.onlinemarket.service;

import com.onlinemarket.dto.unitType.CreateUnitTypeDTO;
import com.onlinemarket.dto.unitType.UnitTypeDTO;
import com.onlinemarket.dto.unitType.UpdateUnitTypeDTO;

import java.util.List;

public interface UnitTypeService {
    UnitTypeDTO createUnitType(CreateUnitTypeDTO createUnitTypeDTO);
    UnitTypeDTO updateUnitType(Long id, UpdateUnitTypeDTO updateUnitTypeDTO);
    UnitTypeDTO getUnitTypeById(Long id);
    List<UnitTypeDTO> getUnitTypeList();
    void deleteUnitTypeById(Long id);
}
