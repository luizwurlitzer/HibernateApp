package com.abctreinamentos2;

import java.util.List;
import java.util.Scanner;

public class CursoApp {
	public static void main(String[] args) {
		try {
		
			Scanner entrada = new Scanner(System.in);
			int opcao = 0;
			long codigo;
			String descricao,url;
			long valor;
			CursoDAO dao = new CursoDAO();
			
			while(opcao!=6) {
				System.out.println("\nSistema TOP");
				System.out.println();
				System.out.println("Digite 1 para consultar todos os cursos");
				System.out.println("Digite 2 para consultar um curso especifico");
				System.out.println("Digite 3 para cadastrar um novo curso");
				System.out.println("Digite 4 para atualizar um curso");
				System.out.println("Digite 5 para excluir um curso");
				System.out.println("Digite 6 para sair");
				System.out.println();
				opcao = entrada.nextInt();
				switch (opcao) {
				
				case 1:
					System.out.println("Consultar todos");
					List<Curso> curso = dao.findAll();
					curso.forEach(System.out::println);
					break;				
				case 2:
					System.out.println("Consultar um curso especifico");
					System.out.println("Digite o codigo: ");
					codigo = entrada.nextLong();
					System.out.println(dao.findById(codigo));
					break;
				case 3:
					System.out.println("Cadastrar um novo curso");
					System.out.println("Digite o codigo: ");
					codigo = entrada.nextLong();
					entrada.nextLine();
					System.out.println("Digite a descri��o: ");
					descricao = entrada.nextLine();
					System.out.println("Digite a url: ");
					url = entrada.nextLine();
					System.out.println("Digite o valor: ");
					valor = entrada.nextLong();
					Curso curso2 = new Curso(codigo,descricao,valor, url);
					dao.persist(curso2);
					break;
				case 4:
					System.out.println("atualizar");
					System.out.println("Digite o codigo: ");
					codigo = entrada.nextLong();
					entrada.nextLine();
					System.out.println("Digite a descri��o: ");
					descricao = entrada.nextLine();
					System.out.println("Digite a url: ");
					url = entrada.nextLine();
					System.out.println("Digite o valor: ");
					valor = entrada.nextLong();
					Curso curso1 = new Curso(codigo,descricao,valor, url);
					dao.merge(curso1);
					break;
				case 5:
					System.out.println("Excluir um curso");
					System.out.println("Digite o codigo: ");
					codigo = entrada.nextLong();
					Curso curso5 = dao.findById(codigo);
					dao.delete(curso5);
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
