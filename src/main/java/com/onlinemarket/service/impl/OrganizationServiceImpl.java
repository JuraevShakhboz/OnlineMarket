package com.onlinemarket.service.impl;

import com.onlinemarket.dto.organization.CreateOrganizationDTO;
import com.onlinemarket.dto.organization.OrganizationDTO;
import com.onlinemarket.dto.organization.UpdateOrganizationDTO;
import com.onlinemarket.entity.Organization;
import com.onlinemarket.mapper.OrganizationMapper;
import com.onlinemarket.repository.OrganizationRepository;
import com.onlinemarket.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    OrganizationRepository organizationRepository;

    @Autowired
    OrganizationMapper organizationMapper;

    @Override
    public OrganizationDTO createOrganization(CreateOrganizationDTO createOrganizationDTO) {
        Organization organization = new Organization();
        organization.setName(createOrganizationDTO.getName());
        organization.setAddress(createOrganizationDTO.getAddress());
        organization.setPhoneNumber(createOrganizationDTO.getPhoneNumber());
        return organizationMapper.toDTO(organizationRepository.save(organization));
    }

    @Override
    public OrganizationDTO updateOrganization(Long id, UpdateOrganizationDTO updateOrganizationDTO) {
        Organization organization = organizationRepository.getReferenceById(id);
        organization.setName(updateOrganizationDTO.getName());
        organization.setPhoneNumber(updateOrganizationDTO.getPhoneNumber());
        organization.setAddress(updateOrganizationDTO.getAddress());
        return organizationMapper.toDTO(organizationRepository.save(organization));
    }

    @Override
    public OrganizationDTO getOrganizationById(Long id) {
        return organizationMapper.toDTO(organizationRepository.getReferenceById(id));
    }

    @Override
    public List<OrganizationDTO> getOrganizationList() {
        return organizationMapper.toDTOs(organizationRepository.findAll());
    }

    @Override
    public void deleteOrganizationById(Long id) {
        organizationRepository.deleteById(id);
    }
}
