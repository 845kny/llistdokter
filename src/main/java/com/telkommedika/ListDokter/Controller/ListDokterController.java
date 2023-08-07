package com.telkommedika.ListDokter.Controller;


import com.telkommedika.ListDokter.DTO.ListDokterDTO;
import com.telkommedika.ListDokter.Entity.ListDokterEntity;
import com.telkommedika.ListDokter.Service.ListDokterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/listdokter")
public class ListDokterController {
    
    @Autowired
    ListDokterService listDokterService;

    @GetMapping
    public List<ListDokterDTO> findAllListDokter(){
        return listDokterService.findAllListDokter().stream().map(listDokterEntity -> listDokterService.mapToDTO(listDokterEntity))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Optional<ListDokterEntity> findAllListDokterById(@PathVariable("id") Long id){
        return  listDokterService.findById(id);
    }

    @PostMapping
    public ListDokterDTO saveListDokter(@RequestBody ListDokterDTO request){
        final ListDokterEntity ListDokterEntity = listDokterService.mapToEntity(request);
        final ListDokterEntity result = listDokterService.saveListDokter(ListDokterEntity);
        return listDokterService.mapToDTO(result);
    }

    @PutMapping
    public ListDokterDTO updateListDokter(@RequestBody ListDokterDTO request) {
        final ListDokterEntity listDokterEntity = listDokterService.mapToEntity(request);
        final ListDokterEntity result = listDokterService.updateListDokter(listDokterEntity);
        return listDokterService.mapToDTO(result);}

    @DeleteMapping("/{id}")
    public void deleteListDokter(@PathVariable("id") Long id) {
        listDokterService.deleteListDokter(id);
    }
}
