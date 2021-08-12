package br.com.zup.EcomerceZup.controllers;

import br.com.zup.EcomerceZup.dtos.ClienteDTO;
import br.com.zup.EcomerceZup.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    public ClienteDTO cadastrarCliente(ClienteDTO clienteDTO){
        clienteService.cadastraCliente(clienteDTO);
        return clienteDTO;
    }

    public List<ClienteDTO> mostrarCliente(){
        return clienteService.mostrarClientes();
    }
}
