package com.github.FabioFernandess.vendasapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", length = 100)
	private String nome;

	@Column(name = "preco", precision = 16, scale = 2)
	private BigDecimal preco;

	@Column(name = "descricao", length = 255)
	private String descricao;
	
	@Column(name = "sku")
	private String sku;

	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;

	public Produto() {
		super();

	}

	public Produto(Long id, String nome, BigDecimal preco, String sku, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.sku = sku;
		this.descricao = descricao;
	}

	public Produto(String nome, BigDecimal preco, String sku, String descricao) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.sku = sku;
		this.descricao = descricao;
	}

	@PrePersist
	public void prePersist(){
		this.setDataCadastro(LocalDate.now());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", descricao=" + descricao + ", sku=" + sku
				+ ", dataCadastro=" + dataCadastro + "]";
	}
	
}
