package com.idat.pe.EFEFVICTORCHUMACEROPIZZA.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.pe.EFEFVICTORCHUMACEROPIZZA.entity.Pizza;
@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

}
