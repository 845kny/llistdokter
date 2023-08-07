package com.telkommedika.ListDokter.Service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkommedika.ListDokter.DTO.ListDokterDTO;
import com.telkommedika.ListDokter.Entity.ListDokterEntity;
import com.telkommedika.ListDokter.Repository.ListDokterRepository;
import com.telkommedika.ListDokter.Service.ListDokterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListDokterServiceImpl implements ListDokterService {

    private final ListDokterRepository listDokterRepository;

    public ListDokterServiceImpl(ListDokterRepository listDokterRepository) {
        this.listDokterRepository = listDokterRepository;
    }

    @Override
    public List<ListDokterEntity> findAllListDokter() {
        return listDokterRepository.findAll();
    }

    @Override
    public Optional<ListDokterEntity> findById(Long id) {
        return listDokterRepository.findById(id);
    }

    @Override
    public ListDokterEntity saveListDokter(ListDokterEntity listDokterEntity) {
        return listDokterRepository.save(listDokterEntity);
    }

    @Override
    public ListDokterEntity updateListDokter(ListDokterEntity listDokterEntity) {
        return listDokterRepository.save(listDokterEntity);
    }

    @Override
    public void deleteListDokter(Long id) {
        listDokterRepository.deleteById(id);

    }

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public ListDokterDTO mapToDTO(ListDokterEntity listDokterEntity){return mapper.convertValue(listDokterEntity, ListDokterDTO.class);}

    @Override
    public ListDokterEntity mapToEntity(ListDokterDTO listDokterDTO){return mapper.convertValue(listDokterDTO, ListDokterEntity.class);}
}
