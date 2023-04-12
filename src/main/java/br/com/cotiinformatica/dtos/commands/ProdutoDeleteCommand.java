package br.com.cotiinformatica.dtos.commands;

import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class ProdutoDeleteCommand {
	
	@Min(value = 1, message = "Id do produto deve ser maior ou igual a 1.")
	private Integer id;
}
