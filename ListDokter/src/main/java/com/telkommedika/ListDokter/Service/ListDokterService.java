package com.telkommedika.ListDokter.Service;

import com.telkommedika.ListDokter.DTO.ListDokterDTO;
import com.telkommedika.ListDokter.Entity.ListDokterEntity;

import java.util.List;
import java.util.Optional;

public interface ListDokterService {

    List<ListDokterEntity> findAllListDokter();
    Optional<ListDokterEntity> findById(Long id);
    ListDokterEntity saveListDokter(ListDokterEntity listDokterEntity);
    ListDokterEntity updateListDokter(ListDokterEntity listDokterEntity);
    ListDokterDTO mapToDTO(ListDokterEntity listDokterEntity);
    ListDokterEntity mapToEntity(ListDokterDTO listDokterDTO);
    void deleteListDokter(Long id);

}
