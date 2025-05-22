package com.validator.produto_api.controller;

import com.validator.produto_api.dto.ProdutoDTO;
import com.validator.produto_api.mapper.ProdutoMapper;
import com.validator.produto_api.model.Produto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoDTO criarProduto(@Valid @RequestBody Produto produto) {
        // Simulando o retorno do DTO convertido
        return ProdutoMapper.toDTO(produto);
    }
}
