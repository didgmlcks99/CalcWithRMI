package Calc;

import java.rmi.*;
import java.util.*;

public class RMIClient
{
   public static void main(String args[]) {
    try {

      String host = "rmi://172.17.152.254/CalcServer";
      RemoteCalc calcServer = (RemoteCalc)Naming.lookup(host);

	  int x, y, z;

      Scanner scan = new Scanner(System.in);

	  while(true){
		  System.out.println("==========Calculating Program==========");

		  System.out.print("Enter the first number : ");
		  x = scan.nextInt();

		  System.out.print("Enter the second number : ");
		  y = scan.nextInt();

		  System.out.println("Choose calculation");
		  System.out.println("1 : +");
		  System.out.println("2 : -");
		  System.out.println("3 : *");
		  System.out.println("4 : /");
		  System.out.println("5 : exit");
		  System.out.print("Select one : ");
		  z = scan.nextInt();

		  if(z == 1) System.out.println(x + " + " + y + " = " + calcServer.add(x, y));
		  if(z == 2) System.out.println(x + " - " + y + " = " + calcServer.sub(x, y));
		  if(z == 3) System.out.println(x + " * " + y + " = " + calcServer.mult(x, y));
		  if(z == 4) System.out.println(x + " / " + y + " = " + calcServer.div(x, y));
		  if(z == 5) break;
	  }
    }
    catch (Exception e) {
        System.err.println(e);
    }
   }
}

