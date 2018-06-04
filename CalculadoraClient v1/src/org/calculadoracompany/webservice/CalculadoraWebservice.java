/**
 * CalculadoraWebservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.calculadoracompany.webservice;

public interface CalculadoraWebservice extends java.rmi.Remote {
    public double executarsubtracao(double meuValor1, double meuValor2) throws java.rmi.RemoteException;
    public double executardivisao(double meuValor1, double meuValor2) throws java.rmi.RemoteException;
    public double executarsoma(double meuValor1, double meuValor2) throws java.rmi.RemoteException;
    public double executarmultiplicacao(double meuValor1, double meuValor2) throws java.rmi.RemoteException;
}
