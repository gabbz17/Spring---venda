package com.example.APIVenda.dto.mapper;

import com.example.APIVenda.dto.VendedorDTO;
import com.example.APIVenda.entity.Vendedor;

import java.util.List;

public class VendedorMapper {

    public static List<VendedorDTO> listToDTO(List<Vendedor> user){
        return user.stream().map(VendedorMapper::toDTO).toList();
    }

    public static VendedorDTO toDTO(Vendedor user){
        return new VendedorDTO(user.getId(), user.getNome());
    }
}
