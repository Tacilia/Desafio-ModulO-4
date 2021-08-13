package br.com.zup.EcomerceZup.controllers;


import br.com.zup.EcomerceZup.dtos.ClienteDTO;
import br.com.zup.EcomerceZup.dtos.ProdutoDTO;
import br.com.zup.EcomerceZup.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ProdutoDTO cadastrarProduto(@RequestBody ProdutoDTO produtoDTO) throws Exception {
        produtoService.cadastraProduto(produtoDTO);
        return produtoDTO;
    }

    @GetMapping
    public List<ProdutoDTO> mostrarProduto(){
        return produtoService.mostrarProduto();
    }

    @GetMapping ("/nome")
    public ProdutoDTO buscarProduto(@RequestParam String nome)throws Exception{
        return produtoService.buscarProduto(nome);
    }
}
