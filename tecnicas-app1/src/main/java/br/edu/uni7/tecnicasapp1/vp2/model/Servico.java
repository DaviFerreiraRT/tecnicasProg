package br.edu.uni7.tecnicasapp1.vp2.model;

import java.util.ArrayList;
import java.util.List;

public class Servico {
    private Integer id;
    private double maoDeObra;
    private double precoTotal;

    public Servico(Integer id, double maoDeObra) {
        this.id = id;
        this.maoDeObra = maoDeObra;
        this.precoTotal += maoDeObra;
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
