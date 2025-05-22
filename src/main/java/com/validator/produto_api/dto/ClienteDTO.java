package com.validator.produto_api.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private Integer idade;
}
