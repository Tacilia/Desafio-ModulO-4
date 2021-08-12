package br.com.zup.EcomerceZup.service;


import br.com.zup.EcomerceZup.dtos.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<ClienteDTO>clientes = new ArrayList<>();

    public ClienteDTO cadastraCliente(ClienteDTO cliente){
        clientes.add(cliente);
        return cliente;
    }
    /*public ClienteDTO mostrarCliente(){
        for (ClienteDTO cliente:clientes) {
            return cliente;
        }
        return (ClienteDTO) clientes;
    }*/

    public List<ClienteDTO> mostrarClientes(){
        return clientes;
    }
}
