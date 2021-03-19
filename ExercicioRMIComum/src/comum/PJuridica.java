package comum;

import java.rmi.RemoteException;

public class PJuridica extends Pessoa{

	public PJuridica() throws RemoteException{
		
		super();
	}
	private static final long serialVersionUID = 1L;
	private int cnpj;
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
}
