package com.validator.produto_api.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProdutoDTO {
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer estoque;
}
