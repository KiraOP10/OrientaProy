package com.example.orientaproy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.orientaproy.model.CursoModules;
import com.example.orientaproy.service.CursoServices;
@Controller
@RequestMapping("/api/v1/course")
public class CursoControllers {
    @Autowired
    public CursoServices cursoServices;
    public CursoControllers(CursoServices cursoServices){
        this.cursoServices= cursoServices;

    }
    @PostMapping
    public ResponseEntity<String> agregarCurso(@RequestBody CursoModules cursoModules){
        CursoModules cursoCreado = cursoServices.agregarCurso(cursoModules);

        if (cursoCreado != null) {
            String mensaje = "Curso " + cursoCreado.getNombreCurso()+"agregado correctamente";
            return ResponseEntity.status(HttpStatus.CREATED).body(mensaje);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al registrar un curso");

        }


    }
}
