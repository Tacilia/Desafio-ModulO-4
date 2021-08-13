package br.com.zup.EcomerceZup.dtos;

import java.util.ArrayList;
import java.util.List;

public class CompraDTO {

    private String cpfCliente;
    private List<CompraDTO> compra = new ArrayList<>();


    public CompraDTO(){
    }

    public String getNomeCliente() {
        return cpfCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.cpfCliente = nomeCliente;
    }

    public List<CompraDTO> getCompra() {
        return compra;
    }

    public void setCompra(List<CompraDTO> compra) {
        this.compra = compra;
    }
}
