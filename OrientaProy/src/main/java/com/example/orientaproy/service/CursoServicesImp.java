package com.example.orientaproy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.orientaproy.model.CursoModules;
import com.example.orientaproy.repository.CursoRepository;

@Service
public class CursoServicesImp implements CursoServices  {
    @Autowired
    private CursoRepository cursoRepository;
    public CursoModules agregarCurso(CursoModules cursoModules){
        return cursoRepository.save(cursoModules);
    }
}
