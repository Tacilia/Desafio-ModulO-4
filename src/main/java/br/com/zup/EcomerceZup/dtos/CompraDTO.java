package br.com.zup.EcomerceZup.dtos;

import java.util.ArrayList;
import java.util.List;

public class CompraDTO {

    private ClienteDTO cliente;
    private List<ProdutoDTO> produto = new ArrayList<>();

    public CompraDTO(){

    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public List<ProdutoDTO> getProduto() {
        return produto;
    }

    public void setProduto(List<ProdutoDTO> produto) {
        this.produto = produto;
    }
}
