package com.abctreinamentos2;

import java.util.List;
import java.util.Scanner;

public class ClienteApp {
	public static void main(String[] args) {
		try {
		
			Scanner entrada = new Scanner(System.in);
			int opcao = 0;
			String nome,email;
			long cpf;
			ClienteDAO dao = new ClienteDAO();
			
			while(opcao!=6) {
				System.out.println("\nSistema TOP");
				System.out.println();
				System.out.println("Digite 1 para consultar todos os Clientes");
				System.out.println("Digite 2 para consultar um Cliente especifico");
				System.out.println("Digite 3 para cadastrar um novo Cliente");
				System.out.println("Digite 4 para atualizar um Cliente");
				System.out.println("Digite 5 para excluir um Cliente");
				System.out.println("Digite 6 para sair");
				System.out.println();
				opcao = entrada.nextInt();
				switch (opcao) {
				
				case 1:
					System.out.println("Consultar todos");
					List<Cliente> clientes = dao.findAll();
					clientes.forEach(System.out::println);
					break;				
				case 2:
					System.out.println("Consultar um Cliente especifico");
					System.out.println("Digite o CPF: ");
					cpf = entrada.nextLong();
					System.out.println(dao.findById(cpf));
					break;
				case 3:
					System.out.println("Cadastrar um novo Cliente");
					System.out.println("Digite o CPF: ");
					cpf = entrada.nextLong();
					entrada.nextLine();
					System.out.println("Digite o Nome: ");
					nome = entrada.nextLine();
					System.out.println("Digite o Email: ");
					email = entrada.nextLine();
					Cliente Cliente = new Cliente(cpf, nome, email);
					dao.persist(Cliente);
					break;
				case 4:
					System.out.println("Atualizar Cliente");
					System.out.println("Digite o CPF: ");
					cpf = entrada.nextLong();
					entrada.nextLine();
					System.out.println("Digite o Nome: ");
					nome = entrada.nextLine();
					System.out.println("Digite o Email: ");
					email = entrada.nextLine();
					Cliente Cliente1 = new Cliente(cpf, nome, email);
					dao.merge(Cliente1);
					break;
				case 5:
					System.out.println("Excluir um Cliente");
					System.out.println("Digite o CPF: ");
					cpf = entrada.nextLong();
					Cliente Cliente2 = dao.findById(cpf);
					dao.delete(Cliente2);
					break;
				case 6://sair
					System.out.println("\nSaindo...\n");
					break;

				default:
					break;
				}
			}
			}catch (Exception e) {
				e.printStackTrace();
			}

}
}