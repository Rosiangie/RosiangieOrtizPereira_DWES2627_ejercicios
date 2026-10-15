package org.example.__1_re.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller

public class Controlador {

    @GetMapping("/")
    public String lista(Model model) {
        Random ramdom = new Random();

        int cantidad = ramdom.nextInt(51);

        List<Integer> lista = new ArrayList<>();


        for (int i = 0; i < cantidad; i++) {
            lista.add(ramdom.nextInt(100)+1);
        }

        model.addAttribute("lista", lista);
        model.addAttribute("total", lista.size());

        return "lista";
    }
}