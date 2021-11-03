package br.edu.uni7.tecnicasapp1.vp2.model;

import java.util.ArrayList;
import java.util.List;

public class Servico {
    private Integer id;
    private double maoDeObra;
    private Estoque estoque;
    private double precoTotal;

    public Servico(Integer id, double maoDeObra, Estoque estoque, double precoTotal) {
        this.id = id;
        this.maoDeObra = maoDeObra;
        this.estoque = estoque;
        this.precoTotal = maoDeObra + estoque.getPreco();
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(double maoDeObra) {
        this.maoDeObra = maoDeObra;
    }


    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
}
