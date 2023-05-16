package com.github.FabioFernandess.vendasapi.rest.produtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.FabioFernandess.vendasapi.model.Produto;

public class ProdutoFormRequest {
	private Long id;
	private String nome;
	private BigDecimal preco;
	private String sku;
	private String descricao;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate cadastro;

	public ProdutoFormRequest() {
		super();
	}

	public ProdutoFormRequest(Long id, String nome, BigDecimal preco, String sku, String descricao,
			LocalDate cadastro) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.nome = nome;
		this.preco = preco;
		this.sku = sku;
		this.cadastro = cadastro;
	}

	public Produto toModel() {
		return new Produto(id, nome, preco, descricao, sku);
	}

	public static ProdutoFormRequest fromModel(Produto produto) {
		return new ProdutoFormRequest(
				produto.getId(),
				produto.getNome(),
				produto.getPreco(),
				produto.getSku(),
				produto.getDescricao(),
				produto.getDataCadastro());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public LocalDate getCadastro() {
		return cadastro;
	}

	public void setCadastro(LocalDate cadastro) {
		this.cadastro = cadastro;
	}

	@Override
	public String toString() {
		return "ProdutoFormRequest [id=" + id + ", nome=" + nome + ", preco=" + preco + ", sku=" + sku + ", descricao="
				+ descricao + ", cadastro=" + cadastro + "]";
	}

}
