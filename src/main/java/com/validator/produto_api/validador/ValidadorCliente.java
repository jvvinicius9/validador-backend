package com.validator.produto_api.validador;

import com.validator.produto_api.model.Cliente;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

public class ValidadorCliente {

    public static void main(String[] args) {
        // Criando um cliente com dados inválidos
        Cliente cliente = new Cliente();
        cliente.setId(null);
        cliente.setNome("Jo");
        cliente.setEmail("email_invalido");
        cliente.setCpf("123");
        cliente.setIdade(15);

        // Criando o validador
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        // Validando o cliente
        Set<ConstraintViolation<Cliente>> violations = validator.validate(cliente);

        if (violations.isEmpty()) {
            System.out.println("Cliente válido!");
        } else {
            System.out.println("Erros de validação:");
            for (ConstraintViolation<Cliente> violation : violations) {
                System.out.println("- " + violation.getPropertyPath() + ": " + violation.getMessage());
            }
        }
    }
}