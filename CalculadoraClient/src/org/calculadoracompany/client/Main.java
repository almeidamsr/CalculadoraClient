package org.calculadoracompany.client;

import java.rmi.RemoteException;

import org.calculadoracompany.webservice.CalculadoraWebservice;
import org.calculadoracompany.webservice.CalculadoraWebserviceProxy;

public class Main {

	public static void main(String[] args) {
		try {
			CalculadoraWebservice calculadorawebservice = new CalculadoraWebserviceProxy();
			double resultado1 = calculadorawebservice.executarsoma(1.0,2.0);
			double resultado2 = calculadorawebservice.executardivisao(1.0,2.0);
			double resultado3 = calculadorawebservice.executarsubtracao(1.0,2.0);
			double resultado4 = calculadorawebservice.executarmultiplicacao(1.0,2.0);
			System.out.println(resultado1);
			System.out.println(resultado2);
			System.out.println(resultado3);
			System.out.println(resultado4);
		} catch (RemoteException rm) {
			rm.printStackTrace();

		}
	}

}
