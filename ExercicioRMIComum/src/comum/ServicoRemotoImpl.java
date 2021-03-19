package comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto{
	public ServicoRemotoImpl() throws RemoteException{
		
	}
	
	private static final long serialVersionUID = 7334161650385718588L;

	@Override
	public void inserirPF(PFisica p) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PFisica> listarPFisica() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserirPJ(PJuridica p) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PFisica> listarPJuridica() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
