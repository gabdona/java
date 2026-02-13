package br.com.fiap.ms.produto.DTO;

public class ProdutoInputDTO {

        private String nome;
        private String descricao;
        Double valor;

    public ProdutoInputDTO(String nome, String descricao, Double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ProdutoInputDTO() {
    }
}

