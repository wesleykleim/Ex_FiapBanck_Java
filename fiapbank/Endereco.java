package br.com.fiap.fiapbank;

public class Endereco {

	//Atributos
	String rua, complemento, bairro, cep;
	
	short numero;
	
	//M�todos
	short getNumero() {
		return numero;
	}
	
	void setNumero(short novoNumero) {
		numero = novoNumero;
	}
	
}
