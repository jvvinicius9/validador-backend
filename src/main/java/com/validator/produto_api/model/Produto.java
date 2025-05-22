package com.validator.produto_api.model;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Produto {

    @NotNull(message = "ID não pode ser nulo")
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 caracteres")
    private String nome;

    @NotBlank(message = "Descrição é obrigatória")
    @Size(max = 200, message = "Descrição deve ter no máximo 200 caracteres")
    private String descricao;

    @NotNull(message = "Preço é obrigatório")
    @Positive(message = "Preço deve ser positivo")
    private Double preco;

    @Min(value = 0, message = "Estoque não pode ser negativo")
    private Integer estoque;
}
