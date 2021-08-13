package br.com.zup.EcomerceZup.service;


import br.com.zup.EcomerceZup.dtos.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<ClienteDTO>clientes = new ArrayList<>();

    public ClienteDTO cadastraCliente(ClienteDTO cliente) throws Exception {
        validarCliente(cliente.getCpf(), cliente.getEmail());
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

    public ClienteDTO buscarCliente (String cpf)throws Exception{
        for (ClienteDTO cliente: clientes) {
            if (cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        throw new Exception("Cliente não cadastrado!");
    }

    public String validarCliente (String cpf, String email)throws Exception{
        for (ClienteDTO cliente: clientes) {
            if (cliente.getCpf().equals(cpf)){
                throw new Exception("CPF do cliente já cadastrado!");
            }
            else if (cliente.getEmail().equals(email)){
                throw new Exception("Email do cliente já cadastrado");
            }
        }
        return ("Cliente cadastrado com sucesso");
    }
}
