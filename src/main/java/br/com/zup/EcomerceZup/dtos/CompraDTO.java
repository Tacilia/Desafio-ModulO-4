package br.com.zup.EcomerceZup.dtos;

import java.util.ArrayList;
import java.util.List;

public class CompraDTO {

    private String nomeCliente;
    private List<CompraDTO> compra = new ArrayList<>();


    public CompraDTO(){
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<CompraDTO> getCompra() {
        return compra;
    }

    public void setCompra(List<CompraDTO> compra) {
        this.compra = compra;
    }
}
