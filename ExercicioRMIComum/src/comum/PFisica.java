package comum;

import java.rmi.RemoteException;

public class PFisica extends Pessoa{

	public PFisica() throws RemoteException{
		
		super();
	}
	private static final long serialVersionUID = 1L;
	private int idade;
	private float salario;
	private String pai;
	private String mae;
	private int cpf;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
