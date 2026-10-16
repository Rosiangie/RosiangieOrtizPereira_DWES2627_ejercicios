package org.example._e3.controladores;

import org.example._e3.modelo.Modulo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller

public class Controlador {

    private static final List<Modulo> lista(){
        List<Modulo> modulos = new ArrayList<>();

        Modulo a1 = new Modulo(1, "a1", 1, 500);
        Modulo a2 = new Modulo(2, "a2", 1, 500);
        Modulo a3 = new Modulo(3, "a3", 1, 500);
        Modulo a4 = new Modulo(4, "a4", 2, 500);
        Modulo a5 = new Modulo(5, "a5", 2, 500);
        Modulo a6 = new Modulo(6, "a6", 2, 500);

        modulos.add(a1);
        modulos.add(a2);
        modulos.add(a3);
        modulos.add(a4);
        modulos.add(a5);
        modulos.add(a6);

        return modulos;
    }

    @GetMapping("/")
    public String listarModulos(@RequestParam(required = false) Integer curso, Model model){
        List<Modulo> modulos = new ArrayList<>();

        Modulo a1 = new Modulo(1, "a1", 1, 100);
        Modulo a2 = new Modulo(2, "a2", 1, 200);
        Modulo a3 = new Modulo(3, "a3", 1, 300);
        Modulo a4 = new Modulo(4, "a4", 2, 400);
        Modulo a5 = new Modulo(5, "a5", 2, 500);
        Modulo a6 = new Modulo(6, "a6", 2, 600);

        modulos.add(a1);
        modulos.add(a2);
        modulos.add(a3);
        modulos.add(a4);
        modulos.add(a5);
        modulos.add(a6);

        List<Modulo> listaModulos;

        if(curso!=null){
            listaModulos=Modulo.filtrarModulos(modulos, curso);
        }
        else {
            listaModulos = modulos;
        }
        model.addAttribute("modulos", listaModulos);
        model.addAttribute("cursoActual", curso);

        return "modulos";
}


}

