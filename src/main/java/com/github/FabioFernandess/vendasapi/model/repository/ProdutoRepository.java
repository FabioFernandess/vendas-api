package com.github.FabioFernandess.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.FabioFernandess.vendasapi.model.Produto;
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
