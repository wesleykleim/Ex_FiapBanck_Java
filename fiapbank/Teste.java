package br.com.fiap.fiapbank;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		//Instanciar o Cliente
		Cliente cliente = new Cliente();
		
		//Instanciar o Endereco
		Endereco endereco = new Endereco();
		
		//Instanciar a Conta Corrente
		ContaCorrente cc = new ContaCorrente();
		
		//Instanciar o Scanner (objeto para ler o teclado)
		Scanner leitor = new Scanner(System.in);
		
		//Atribuir valores para o Cliente (atributos)
		System.out.println("Digite o nome");
		cliente.nome = leitor.next() + leitor.nextLine(); //ler uma linha -> mais de uma palavra
		System.out.println("Digite o cpf");
		cliente.cpf = leitor.next() + leitor.nextLine();
		cliente.endereco = endereco;
		
		//Atributir valores para o Endereço (atributos)
		//sysout -> CTRL + espaço
		System.out.println("Digite a rua");
		endereco.rua = leitor.next() + leitor.nextLine();
		System.out.println("Digite o bairro");
		endereco.bairro = leitor.next() + leitor.nextLine();
		System.out.println("Digite o número");
		endereco.numero = leitor.nextShort();
		System.out.println("Digite o cep");
		endereco.cep = leitor.next() + leitor.nextLine();
		
		//Atribuir valores para a Conta Corrente (atributos)
		System.out.println("Digite o saldo");
		cc.saldo = leitor.nextDouble();
		cc.titular = cliente;
		
		//Fechar o leitor
		leitor.close();
	}
}