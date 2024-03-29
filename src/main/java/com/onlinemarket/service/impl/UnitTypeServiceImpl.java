package com.onlinemarket.service.impl;

import com.onlinemarket.dto.unitType.CreateUnitTypeDTO;
import com.onlinemarket.dto.unitType.UnitTypeDTO;
import com.onlinemarket.dto.unitType.UpdateUnitTypeDTO;
import com.onlinemarket.entity.UnitType;
import com.onlinemarket.mapper.UnitTypeMapper;
import com.onlinemarket.repository.UnitTypeRepository;
import com.onlinemarket.service.UnitTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitTypeServiceImpl implements UnitTypeService {

    @Autowired
    UnitTypeRepository unitTypeRepository;

    @Autowired
    UnitTypeMapper unitTypeMapper;

    @Override
    public UnitTypeDTO createUnitType(CreateUnitTypeDTO createUnitTypeDTO) {
        UnitType unitType = new UnitType();
        unitType.setName(createUnitTypeDTO.getName());
        return unitTypeMapper.toDTO(unitTypeRepository.save(unitType));
    }

    @Override
    public UnitTypeDTO updateUnitType(Long id, UpdateUnitTypeDTO updateUnitTypeDTO) {
        UnitType unitType = unitTypeRepository.getReferenceById(id);
        unitType.setName(updateUnitTypeDTO.getName());
        return unitTypeMapper.toDTO(unitTypeRepository.save(unitType));
    }

    @Override
    public UnitTypeDTO getUnitTypeById(Long id) {
        return unitTypeMapper.toDTO(unitTypeRepository.getReferenceById(id));
    }

    @Override
    public List<UnitTypeDTO> getUnitTypeList() {
        return unitTypeMapper.toDTOs(unitTypeRepository.findAll());
    }

    @Override
    public void deleteUnitTypeById(Long id) {
        unitTypeRepository.deleteById(id);
    }
}
