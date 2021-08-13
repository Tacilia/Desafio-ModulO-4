package br.com.zup.EcomerceZup.service;

import br.com.zup.EcomerceZup.dtos.CompraDTO;
import br.com.zup.EcomerceZup.dtos.ProdutoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private List<ProdutoDTO> produtos = new ArrayList<>();

    public ProdutoDTO cadastraProduto(ProdutoDTO produto)throws Exception{
        validarProdutoDTO(produto.getNome());
        produtos.add(produto);
        return produto;
    }

    public List<ProdutoDTO> mostrarProduto(){
        return produtos;
    }

    public ProdutoDTO buscarProduto (String nome)throws Exception{
        for (ProdutoDTO produto: produtos) {
            if (produto.getNome().equals(nome)){
                return produto;
            }
        }
        throw new Exception("Produto não cadastrado!");
    }

    public void validarProdutoDTO (String nome)throws Exception{
        for (ProdutoDTO produto: produtos) {
            if (produto.getNome().equals(nome)) {
                throw new Exception("Nome do produto já cadastrado!");
            }
        }
    }
    /*public List<CompraDTO> mostrarCliente(){
        return compras;
    }*/
}
