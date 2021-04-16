package Calc;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class RemoteCalcImpl extends UnicastRemoteObject implements RemoteCalc
{
    public RemoteCalcImpl() throws RemoteException {  }

    public int add(int x, int y) throws RemoteException{
		return x + y;
	}

	public int sub(int x, int y) throws RemoteException{
			return x - y;
	}

	public int mult(int x, int y) throws RemoteException{
			return x * y;
	}

	public int div(int x, int y) throws RemoteException{
			return x / y;
	}

   public static void main(String[] args)  {
        try {
            RemoteCalc calcServer = new RemoteCalcImpl();
            Naming.rebind("CalcServer", calcServer);
            System.out.println("CalcServer bound in registry");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }



}
