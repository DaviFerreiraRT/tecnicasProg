package br.edu.uni7.tecnicasapp1.model;

import java.util.ArrayList;

public class Materia {

    private String titulo;
    private String texto;
    private String comentarios ;

    public Materia() {

    }

    public Materia(String titulo, String texto,String comentario1) {
        this.titulo = titulo;
        this.texto = texto;
        this.comentarios=comentario1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getComentarios() {
        return comentarios;
    }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
