package br.com.fiap.ms.produto.DTO;

import java.util.List;

public class ProdutoResponseDTO {
    private Long id;
    private String nome;
    private String descricao;
    private Double valor;

    public ProdutoResponseDTO(Long id,String nome, String descricao,Double valor){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public static List<ProdutoResponseDTO> createMock(){

        return List.of(
        new ProdutoResponseDTO(1L, "smart tv", "smart tv lg LED 50 polegadas", 2285.0),
        new ProdutoResponseDTO(2L, "mouse microsoft", "mouse sem fio", 250.0),
        new ProdutoResponseDTO(3L, "teclado microsoft", "teclado sem fio", 250.0)
        );
    }
}
