package br.com.zup.EcomerceZup.dtos;

import java.util.List;

public class CompraDTO {

    private String nome;
    private List<ProdutoDTO> venda;

    public CompraDTO(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProdutoDTO> getVenda() {
        return venda;
    }

    public void setVenda(List<ProdutoDTO> venda) {
        this.venda = venda;
    }
}
