package com.telkommedika.ListDokter.Repository;

import com.telkommedika.ListDokter.Entity.ListDokterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListDokterRepository extends JpaRepository<ListDokterEntity, Long> {
}
