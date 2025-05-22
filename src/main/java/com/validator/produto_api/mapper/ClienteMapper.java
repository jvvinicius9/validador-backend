package com.validator.produto_api.mapper;

import com.validator.produto_api.dto.ClienteDTO;
import com.validator.produto_api.model.Cliente;

public class ClienteMapper {

    public static ClienteDTO toDTO(Cliente cliente) {
        return ClienteDTO.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .email(cliente.getEmail())
                .cpf(cliente.getCpf())
                .idade(cliente.getIdade())
                .build();
    }
}
