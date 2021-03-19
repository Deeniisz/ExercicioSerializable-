package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import comum.IServicoRemoto;
import comum.PFisica;
import comum.PJuridica;
import comum.Pessoa;

public class AppPrincipal {
	public static void main(String[] args) {

		try {
			IServicoRemoto objPessoa = (IServicoRemoto) Naming.lookup("rmi://localhost:8282/pessoa");

			/*
			 * Professor p1 = new Professor();
			 * 
			 * p1.setId(1); p1.setNome("Pedro"); p1.setTelefone("(12) 1234-5678");
			 * p1.setCidade("Araraquara");
			 * 
			 * Professor p2 = new Professor(); p2.setId(2); p2.setNome("Bruno");
			 * p2.setTelefone("(11) 4321-7656"); p2.setCidade("Araraquara");
			 * 
			 * objPessoa.inserir(p1); objPessoa.inserir(p2);
			 * 
			 * for(Pessoa professor : objPessoa.listarPessoa()) { System.out.println("ID: "+
			 * professor.getId()); System.out.println("Nome: "+ professor.getNome());
			 * System.out.println("Telefone: "+ professor.getTelefone());
			 * System.out.println("Cidade: "+ professor.getCidade());-
			 */
			int i = 99;
			String tipo;
			int id;
			String nome;
			String telefone;
			int idade;
			String endereco;
			String cidade;
			String estado;
			float salario;
			String pai;
			String mae;
			int cpf;
			int cnpj;
			Scanner ler = new Scanner(System.in);
			while (i != 0) {
				System.out.println("*---Menu---*");
				System.out.println("1 - Inserir Pessoa");
				i = ler.nextInt();
				System.out.println("2 - Listar Pessoa");
				i = ler.nextInt();
				System.out.println("3 - Gerar Aumento");
				i = ler.nextInt();
				System.out.println("0 - Encerrar");
				i = ler.nextInt();
				if (i == 1) {
					System.out.println("*--Inserir Pessoa--*");
					System.out.println("*(PF ou PJ):");
					tipo = ler.nextLine();
					if (tipo == "PF") {
						PFisica p = new PFisica();

						System.out.println("ID:");
						id = ler.nextInt();
						System.out.println("Nome:");
						nome = ler.nextLine();
						System.out.println("Telefone:");
						telefone = ler.nextLine();
						System.out.println("Idade:");
						idade = ler.nextInt();
						System.out.println("Endereco:");
						endereco = ler.nextLine();
						System.out.println("Cidade:");
						cidade = ler.nextLine();
						System.out.println("Estado:");
						estado = ler.nextLine();
						System.out.println("Salario:");
						salario = ler.nextFloat();
						System.out.println("Nome do Pai:");
						pai = ler.nextLine();
						System.out.println("Nome da Mãe:");
						mae = ler.nextLine();
						System.out.println("CPF:");
						cpf = ler.nextInt();

						p.setId(id);
						p.setNome(nome);
						p.setTelefone(telefone);
						p.setCidade(cidade);
						p.setEndereco(endereco);
						p.setCidade(cidade);
						p.setEstado(estado);
						p.setSalario(salario);
						p.setPai(pai);
						p.setMae(mae);
						p.setCpf(cpf);

						objPessoa.inserirPF(p);
					} else {
						if (tipo == "PJ") {
							PJuridica p1 = new PJuridica();

							System.out.println("ID:");
							id = ler.nextInt();
							System.out.println("Nome:");
							nome = ler.nextLine();
							System.out.println("Telefone:");
							telefone = ler.nextLine();
							System.out.println("Endereco:");
							endereco = ler.nextLine();
							System.out.println("Cidade:");
							cidade = ler.nextLine();
							System.out.println("Estado:");
							estado = ler.nextLine();
							System.out.println("CNPJ:");
							cnpj = ler.nextInt();

							p1.setId(id);
							p1.setNome(nome);
							p1.setTelefone(telefone);
							p1.setCidade(cidade);
							p1.setEstado(estado);
							p1.setCnpj(cnpj);

							objPessoa.inserirPJ(p1);
						} else {
							System.out.println("Tipo não reconhecido");
						}
					}
				}

				if (i == 2) {
					for (Pessoa PFisica : objPessoa.listarPJuridica()) {
						System.out.println("ID: " + PFisica.getId());
						System.out.println("Nome: " + PFisica.getNome());
						System.out.println("Telefone: " + PFisica.getTelefone());
						System.out.println("Idade: " + ((comum.PFisica) PFisica).getIdade());
						System.out.println("Endereco:" + PFisica.getEndereco());
						System.out.println("Cidade:" + PFisica.getCidade());
						System.out.println("Estado:" + PFisica.getEstado());
						System.out.println("Salario:" + ((comum.PFisica) PFisica).getSalario());
						System.out.println("Nome do Pai:" + ((comum.PFisica) PFisica).getPai());
						System.out.println("Nome da Mãe:" + ((comum.PFisica) PFisica).getMae());
						System.out.println("CPF:" + ((comum.PFisica) PFisica).getCpf());

						for (Pessoa PJuridica : objPessoa.listarPJuridica()) {
							System.out.println("ID: " + PJuridica.getId());
							System.out.println("Nome: " + PJuridica.getNome());
							System.out.println("Telefone: " + PJuridica.getTelefone());
							System.out.println("Endereco:" + PJuridica.getEndereco());
							System.out.println("Cidade:" + PJuridica.getCidade());
							System.out.println("Estado:" + PJuridica.getEstado());
							System.out.println("CNPJ:" + ((comum.PJuridica) PJuridica).getCnpj());
						}

					}

					if (i == 3) {

					}
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
