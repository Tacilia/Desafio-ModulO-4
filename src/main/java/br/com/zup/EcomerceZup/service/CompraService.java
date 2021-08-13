package br.com.zup.EcomerceZup.service;

import br.com.zup.EcomerceZup.dtos.CompraDTO;
import br.com.zup.EcomerceZup.dtos.ProdutoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompraService {
    private List<CompraDTO> compras = new ArrayList<>();
    private ProdutoService produtoService;

    public List<CompraDTO> cadastrarCompraCliente(CompraDTO compraDTO) throws Exception{
        this.compras.add(compraDTO);
        return compras;
    }
    public List<CompraDTO> mostrarCliente(){
        return compras;
    }
}
