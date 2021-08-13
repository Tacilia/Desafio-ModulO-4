package br.com.zup.EcomerceZup.controllers;


import br.com.zup.EcomerceZup.dtos.CompraDTO;
import br.com.zup.EcomerceZup.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public CompraDTO buscarCompra(@RequestBody String nomeClinete, CompraDTO compraDTO){
       return compraService.compra(nomeClinete, compraDTO);
    }

}
