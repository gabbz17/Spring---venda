package com.example.APIVenda.dto.mapper;

import com.example.APIVenda.dto.ClienteDTO;
import com.example.APIVenda.entity.Cliente;

import java.util.List;

public class ClienteMapper {

    public static ClienteDTO toDTO(Cliente cl){
        return new ClienteDTO(cl.getId(), cl.getNome());
    }

    public static List<ClienteDTO> toAllDTO(List<Cliente> cl){
        return cl.stream().map(ClienteMapper::toDTO).toList();
    }
}
