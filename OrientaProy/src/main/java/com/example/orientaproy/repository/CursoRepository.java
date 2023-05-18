package com.example.orientaproy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.orientaproy.model.CursoModules;

public interface CursoRepository extends JpaRepository <CursoModules,Long> {

    CursoModules save(CursoModules curso);
}
