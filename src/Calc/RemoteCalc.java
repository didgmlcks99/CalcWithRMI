package Calc;

import java.rmi.*;

public interface RemoteCalc extends Remote
{
	public abstract int add(int x, int y) throws RemoteException;
	public abstract int sub(int x, int y) throws RemoteException;
	public abstract int mult(int x, int y) throws RemoteException;
	public abstract int div(int x, int y) throws RemoteException;
}
