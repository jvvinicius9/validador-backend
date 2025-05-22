package com.validator.produto_api.mapper;

import com.validator.produto_api.dto.ProdutoDTO;
import com.validator.produto_api.model.Produto;

public class ProdutoMapper {

    public static ProdutoDTO toDTO(Produto produto) {
        return ProdutoDTO.builder()
                .id(produto.getId())
                .nome(produto.getNome())
                .descricao(produto.getDescricao())
                .preco(produto.getPreco())
                .estoque(produto.getEstoque())
                .build();
    }
}
