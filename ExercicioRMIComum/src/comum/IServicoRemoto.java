package comum;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServicoRemoto extends Remote{

	void inserirPF(PFisica p) throws RemoteException;

	List<PFisica> listarPFisica() throws RemoteException;
	
	
	void inserirPJ(PJuridica p) throws RemoteException;

	List<PFisica> listarPJuridica() throws RemoteException;


}
