package org.example._e3.models;

public class Modulo {
    private int id;
    private String nombre;
    private int curso;
    private int horas;

    public Modulo(int id, String nombre,  int curso, int horas) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
