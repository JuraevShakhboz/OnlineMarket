package com.onlinemarket.mapper;

import com.onlinemarket.dto.organization.OrganizationDTO;
import com.onlinemarket.entity.Organization;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganizationMapper extends EntityMapper<OrganizationDTO, Organization>{
}
