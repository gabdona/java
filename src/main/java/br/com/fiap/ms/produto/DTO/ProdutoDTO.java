package br.com.fiap.ms.produto.DTO;

import java.util.List;

public class ProdutoDTO {


    private Long id;
    private String nome;
    private String descricao;
    private Double valor;

    public ProdutoDTO(Long id, String nome, String descricao, Double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public ProdutoDTO() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public static List<ProdutoDTO> createMock() {

        return List.of(
                new ProdutoDTO(1L, "smart tv", "smart tv lg LED 50 polegadas", 2285.0),
                new ProdutoDTO(2L, "mouse microsoft", "mouse sem fio", 250.0),
                new ProdutoDTO(3L, "teclado microsoft", "teclado sem fio", 250.0)
        );
    }


}
