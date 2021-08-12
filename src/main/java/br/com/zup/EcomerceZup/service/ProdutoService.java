package br.com.zup.EcomerceZup.service;

import br.com.zup.EcomerceZup.dtos.ClienteDTO;
import br.com.zup.EcomerceZup.dtos.ProdutoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private List<ProdutoDTO> produtos = new ArrayList<>();

    public ProdutoDTO cadastraProduto(ProdutoDTO produto){
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
        throw new Exception("Produto já cadastrado!");
    }
}
