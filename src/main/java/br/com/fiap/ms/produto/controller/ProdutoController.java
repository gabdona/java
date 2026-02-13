package br.com.fiap.ms.produto.controller;

import br.com.fiap.ms.produto.DTO.ProdutoDTO;
import br.com.fiap.ms.produto.DTO.ProdutoInputDTO;
import br.com.fiap.ms.produto.DTO.ProdutoResponseDTO;
import br.com.fiap.ms.produto.entities.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> getProduto(){

        List<ProdutoDTO> dto = ProdutoDTO.createMock();
        return ResponseEntity.ok(dto);
    }
    @PostMapping
    public  ResponseEntity<ProdutoDTO> createProduto(
            @RequestBody ProdutoInputDTO inputDTO) {
        ProdutoDTO dto = new ProdutoDTO(1L, inputDTO.getNome(), inputDTO.getDescricao(), inputDTO.getValor());
        return ResponseEntity.created(null).body(dto);
    }
}


//List<Produto> produtos = new ArrayList<>();
//        produtos.add (new Produto(1L, "smart tv", "smart tv lg LED 50 polegadas", 2285.0));
//        produtos.add (new Produto(2L, "mouse microsoft", "mouse sem fio", 250.0));
//        produtos.add (new Produto(3L, "teclado microsoft", "teclado sem fio", 250.0));
