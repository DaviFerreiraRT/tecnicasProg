package br.edu.uni7.tecnicasapp1.vp2.model;

public class Estoque {
    private Integer id;
    private String nome;
    private String fabricante;
    private int qntEstoque;
    private double preco;


    public Estoque(Integer id, String nome, String fabricante, int qntEstoque, double preço) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.qntEstoque = qntEstoque;
        this.preco = preço;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preço) {
        this.preco = preço;
    }
}
