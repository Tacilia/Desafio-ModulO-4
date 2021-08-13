package br.com.zup.EcomerceZup.service;

import br.com.zup.EcomerceZup.dtos.CompraDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompraService {
    private List<CompraDTO> compras = new ArrayList<>();

    public CompraDTO compra (String cpfCliente, CompraDTO compraDTO) throws Exception {
        for (CompraDTO compra : compras) {
            if (compra.getNomeCliente().equals(cpfCliente)){
                compra.getCompra().add(compraDTO);
            }
        }
        throw new Exception("Compra não encontrada!");
    }
    public List<CompraDTO> mostrarLista(String cpfClinete, CompraDTO compraDTO){
        return compras;
    }
}
