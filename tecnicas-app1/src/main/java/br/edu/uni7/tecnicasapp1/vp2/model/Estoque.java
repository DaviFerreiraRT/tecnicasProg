package br.edu.uni7.tecnicasapp1.vp2.model;

public class Estoque {
    private Integer id;
    private String nome;
    private String fabricante;
    private String qntEstoque;
    private String preco;


    public Estoque(Integer id, String nome, String fabricante, String qntEstoque, String preço) {
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

    public String getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(String qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preço) {
        this.preco = preço;
    }
}
