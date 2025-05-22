package com.validator.produto_api.controller;

import com.validator.produto_api.dto.ClienteDTO;
import com.validator.produto_api.mapper.ClienteMapper;
import com.validator.produto_api.model.Cliente;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDTO criarCliente(@Valid @RequestBody Cliente cliente) {
        // Aqui apenas retornamos o DTO convertido, simulando o cadastro
        return ClienteMapper.toDTO(cliente);
    }
}
