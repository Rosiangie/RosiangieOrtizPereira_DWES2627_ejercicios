package org.example._e3.controllers;

import org.example._e3.models.Modulo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
public class ModuloControlador {

    List<Modulo> listaModulos = new ArrayList<>();

    public  ModuloControlador(){
        inicializarModulos();
    }

    @GetMapping("/modulos")
    public String obtenerModulos(@RequestParam(required = false) Integer curso,Model model){
        model.addAttribute("modulos", filtarModulo(curso));
        return "modulosLista";
    }
    private List<Modulo> filtarModulo(Integer curso){
        return listaModulos.stream()
                .filter(x-> curso== null || curso == x.getCurso())
                .collect(Collectors.toList());
    }
    private void inicializarModulos(){
        listaModulos.add(new Modulo(1, "Servidor", 2, 200));
        listaModulos.add(new Modulo(2,"Cliente", 2, 180));
        listaModulos.add(new Modulo(3, "Interfaces", 2, 168));
        listaModulos.add(new Modulo(4,"Base de datos", 1, 190));
        listaModulos.add(new Modulo(5, "Lenguaje de marcas", 1, 190));
        listaModulos.add(new Modulo(6, "Programación", 1, 220));
    }



}
