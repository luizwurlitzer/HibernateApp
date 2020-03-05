package com.abctreinamentos2;

import java.util.List;
import java.util.Scanner;

public class PagamentoApp {
	public static void main(String[] args) {
		try {
		
			Scanner entrada = new Scanner(System.in);
			int opcao = 0;
			long cd_curso,cpf;
			String dt_inscricao;
			PagamentoDAO dao = new PagamentoDAO();
			
			while(opcao!=6) {
				System.out.println("\nSistema TOP");
				System.out.println();
				System.out.println("Digite 1 para consultar todos os Pagamentos");
				System.out.println("Digite 2 para consultar um Pagamento especifico");
				System.out.println("Digite 3 para cadastrar um novo Pagamento");
				System.out.println("Digite 4 para atualizar um Pagamento");
				System.out.println("Digite 5 para excluir um Pagamento");
				System.out.println("Digite 6 para sair");
				System.out.println();
				opcao = entrada.nextInt();
				switch (opcao) {
				
				case 1:
					System.out.println("Consultar todos");
					List<Pagamento> pagamento = dao.findAll();
					pagamento.forEach(System.out::println);
					break;				
				case 2:
					System.out.println("Consultar um Pagamento especifico");
					System.out.println("Digite o CPF: ");
					cpf = entrada.nextLong();
					System.out.println("Digite o cd_curso: ");
					cd_curso= entrada.nextLong();
					PagamentoId pagamentoId = new PagamentoId(cpf,cd_curso);
					System.out.println(dao.findById(pagamentoId));
					break;
				case 3:
					System.out.println("Cadastrar um novo Pagamento");
					System.out.println("Digite o CPF: ");
					cpf = entrada.nextLong();
					System.out.println("Digite o cd_curso: ");
					cd_curso = entrada.nextLong();
					PagamentoId pagamentoId2 = new PagamentoId(cpf,cd_curso);
					entrada.nextLine();//limpa buffer
					System.out.println("Digite a data do pagamento: ");
					dt_inscricao = entrada.nextLine();
					Pagamento pagamento7 = new Pagamento(pagamentoId2, dt_inscricao);
					dao.persist(pagamento7);
					break;
				case 4:
					System.out.println("Atualizar Pagamento");
					System.out.println("Digite o CPF: ");
					cpf = entrada.nextLong();
					System.out.println("Digite o cd_curso: ");
					cd_curso = entrada.nextLong();
					PagamentoId pagamentoId3 = new PagamentoId(cpf,cd_curso);
					entrada.nextLine();//limpa buffer
					System.out.println("Digite a data do pagamento: ");
					dt_inscricao = entrada.nextLine();
					Pagamento pagamento3 = new Pagamento(pagamentoId3, dt_inscricao);
					dao.merge(pagamento3);
					break;
				case 5:
					System.out.println("Excluir um Pagamento");
					System.out.println("Digite o CPF: ");
					cpf = entrada.nextLong();
					System.out.println("Digite o cd_curso: ");
					cd_curso = entrada.nextLong();
					PagamentoId pagamentoId4 = new PagamentoId(cpf,cd_curso);
					dao.delete(dao.findById(pagamentoId4));
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
