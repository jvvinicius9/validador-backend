package com.validator.produto_api.validador;

import com.validator.produto_api.model.Produto;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

public class ValidadorProduto {

    public static void main(String[] args) {
        // Criando um produto com dados inválidos
        Produto produto = new Produto();
        produto.setId(null);
        produto.setNome("AB");
        produto.setDescricao(""); // vazio
        produto.setPreco(-50.0);
        produto.setEstoque(-1);

        // Criando o validador
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        // Validando o produto
        Set<ConstraintViolation<Produto>> violations = validator.validate(produto);

        if (violations.isEmpty()) {
            System.out.println("Produto válido!");
        } else {
            System.out.println("Erros de validação:");
            for (ConstraintViolation<Produto> violation : violations) {
                System.out.println("- " + violation.getPropertyPath() + ": " + violation.getMessage());
            }
        }
    }
}
