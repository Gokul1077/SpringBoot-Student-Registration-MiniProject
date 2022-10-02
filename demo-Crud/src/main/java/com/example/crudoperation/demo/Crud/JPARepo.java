package com.example.crudoperation.demo.Crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPARepo extends JpaRepository<Model_Registration, Integer>{

}
