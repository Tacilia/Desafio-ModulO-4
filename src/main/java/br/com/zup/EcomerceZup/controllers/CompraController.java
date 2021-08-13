package br.com.zup.EcomerceZup.controllers;


import br.com.zup.EcomerceZup.dtos.CompraDTO;
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
    public CompraDTO buscarCompra(@RequestBody String cpfClinete, CompraDTO compraDTO) throws Exception {
        return compraService.compra(cpfClinete, compraDTO);
    }

    @GetMapping("/cpfCliente")
    public void mostrarLista(String cpfClinete, CompraDTO compraDTO) {
        List<CompraDTO> compra;
    }
}
