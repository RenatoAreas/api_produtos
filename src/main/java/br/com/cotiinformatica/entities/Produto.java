package br.com.cotiinformatica.entities;

import lombok.Data;

@Data
public class Produto {
	
	private Integer id;
	private String nome;
	private String descricao;
	private Double preco;
	private Double quantidade;
	private Categoria categoria;

}
