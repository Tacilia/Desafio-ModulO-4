package br.com.zup.EcomerceZup.controllers;

import br.com.zup.EcomerceZup.dtos.ClienteDTO;
import br.com.zup.EcomerceZup.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteDTO cadastrarCliente(@RequestBody ClienteDTO clienteDTO) throws Exception {
        clienteService.cadastraCliente(clienteDTO);
        return clienteDTO;
    }

    @GetMapping
    public List<ClienteDTO> mostrarCliente(){
        return clienteService.mostrarClientes();
    }

    @GetMapping ("/cpf")
    public ClienteDTO buscarCliente(@RequestParam String cpf)throws Exception{
        return clienteService.buscarCliente(cpf);
    }
}
