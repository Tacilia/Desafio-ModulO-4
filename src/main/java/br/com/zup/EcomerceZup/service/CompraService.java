package br.com.zup.EcomerceZup.service;

import br.com.zup.EcomerceZup.dtos.CompraDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompraService {
    private List<CompraDTO> compras = new ArrayList<>();

    public void compra (String nomeCliente, CompraDTO compraDTO) {
        for (CompraDTO compra : compras) {
            if (compra.getNomeCliente().equals(nomeCliente)){
                compra.getCompra().add(compraDTO);
            }
        }
    }
}
