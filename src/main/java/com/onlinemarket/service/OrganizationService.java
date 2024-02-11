package com.onlinemarket.service;

import com.onlinemarket.dto.organization.CreateOrganizationDTO;
import com.onlinemarket.dto.organization.OrganizationDTO;
import com.onlinemarket.dto.organization.UpdateOrganizationDTO;

import java.util.List;

public interface OrganizationService {
    OrganizationDTO createOrganization(CreateOrganizationDTO createOrganizationDTO);
    OrganizationDTO updateOrganization(Long id, UpdateOrganizationDTO updateOrganizationDTO);
    OrganizationDTO getOrganizationById(Long id);
    List<OrganizationDTO> getOrganizationList();
    void deleteOrganizationById(Long id);
}
