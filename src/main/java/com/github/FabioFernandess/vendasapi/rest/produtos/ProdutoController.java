package com.github.FabioFernandess.vendasapi.rest.produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.FabioFernandess.vendasapi.model.Produto;
import com.github.FabioFernandess.vendasapi.model.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@PostMapping
	public ProdutoFormRequest salvar(@RequestBody ProdutoFormRequest produto) {
		
		Produto entidadeProduto = new Produto(produto.getNome(),produto.getPreco(),produto.getSku(),produto.getDescricao());
		
		Produto p = repository.save(entidadeProduto);
System.out.println(p);
		return produto;
	}
}
