

package com.generation.lojadegames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
	private String nome;
	
	private String descricao;
	
	@NotBlank(message = "O atributo console é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo console deve conter no mínimo 05 e no máximo 100 caracteres")
	private String console;
	
	@NotNull(message = "O atributo preço é obrigatório!")
	@Column(precision = 8, scale = 2)
	private BigDecimal preco;
	
	@Size(min = 5, max = 1000, message = "O atributo foto deve conter no mínimo 05 e no máximo 100 caracteres")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categorias categoria;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	} 
	

}


