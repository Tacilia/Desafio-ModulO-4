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

    public void cadastrarCompraCliente(String cpf, ProdutoDTO produtoDTO) throws Exception{
        for (CompraDTO compra: compras) {
            if (compra.getCliente().getCpf().equals(cpf)){
                compra.getProduto().add(produtoDTO);
            }
            throw new Exception("Compra não cadastrada");
        }
    }
    public List<CompraDTO> mostrarCliente(){
        return compras;
    }
}
