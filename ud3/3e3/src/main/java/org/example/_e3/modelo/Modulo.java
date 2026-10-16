package org.example._e3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
    private Integer id;
    private String nombre;
    private int curso;
    private int horas;

    public Modulo(int id, String nombre, int curso, int horas) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.horas = horas;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCurso() {
        return curso;
    }

    public int getHoras() {
        return horas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public static List<Modulo> filtrarModulos(List<Modulo> modules, int curso){
        List<Modulo> listaModulos = new ArrayList<>();

        for(Modulo modulo : modules){
            if(modulo.getCurso()==curso){
                listaModulos.add(modulo);
            }


        }return listaModulos;

    }

    @Override
    public String toString() {
        return "Modulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", curso=" + curso +
                ", horas=" + horas +
                '}';
    }
}
