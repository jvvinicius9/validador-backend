package com.validator.produto_api.model;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Cliente {

    @NotNull(message = "ID é obrigatório")
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 3, max = 60, message = "Nome deve ter entre 3 e 60 caracteres")
    private String nome;

    @NotBlank(message = "E-mail é obrigatório")
    @Email(message = "E-mail inválido")
    private String email;

    @NotBlank(message = "CPF é obrigatório")
    @Pattern(regexp = "\\d{11}", message = "CPF deve conter exatamente 11 dígitos")
    private String cpf;

    @NotNull(message = "Idade é obrigatória")
    @Min(value = 18, message = "Cliente deve ter no mínimo 18 anos")
    private Integer idade;
}
