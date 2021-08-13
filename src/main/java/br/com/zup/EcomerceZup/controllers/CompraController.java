package br.com.zup.EcomerceZup.controllers;


import br.com.zup.EcomerceZup.dtos.CompraDTO;
import br.com.zup.EcomerceZup.dtos.ProdutoDTO;
import br.com.zup.EcomerceZup.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public void cadastrarCompraCliente(@RequestBody CompraDTO compraDTO) throws Exception {

        compraService.cadastrarCompraCliente(compraDTO);
    }

    @GetMapping
    public List<CompraDTO> mostrarCompra(){
        return compraService.mostrarCliente();
    }
}