package org.calculadoracompany.webservice;

public class CalculadoraWebserviceProxy implements org.calculadoracompany.webservice.CalculadoraWebservice {
  private String _endpoint = null;
  private org.calculadoracompany.webservice.CalculadoraWebservice calculadoraWebservice = null;
  
  public CalculadoraWebserviceProxy() {
    _initCalculadoraWebserviceProxy();
  }
  
  public CalculadoraWebserviceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraWebserviceProxy();
  }
  
  private void _initCalculadoraWebserviceProxy() {
    try {
      calculadoraWebservice = (new org.calculadoracompany.webservice.CalculadoraCalculadorawebserviceLocator()).getCalculadoraEndPointPort();
      if (calculadoraWebservice != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadoraWebservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadoraWebservice)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadoraWebservice != null)
      ((javax.xml.rpc.Stub)calculadoraWebservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.calculadoracompany.webservice.CalculadoraWebservice getCalculadoraWebservice() {
    if (calculadoraWebservice == null)
      _initCalculadoraWebserviceProxy();
    return calculadoraWebservice;
  }
  
  public double executarsubtracao(double meuValor1, double meuValor2) throws java.rmi.RemoteException{
    if (calculadoraWebservice == null)
      _initCalculadoraWebserviceProxy();
    return calculadoraWebservice.executarsubtracao(meuValor1, meuValor2);
  }
  
  public double executardivisao(double meuValor1, double meuValor2) throws java.rmi.RemoteException{
    if (calculadoraWebservice == null)
      _initCalculadoraWebserviceProxy();
    return calculadoraWebservice.executardivisao(meuValor1, meuValor2);
  }
  
  public double executarsoma(double meuValor1, double meuValor2) throws java.rmi.RemoteException{
    if (calculadoraWebservice == null)
      _initCalculadoraWebserviceProxy();
    return calculadoraWebservice.executarsoma(meuValor1, meuValor2);
  }
  
  public double executarmultiplicacao(double meuValor1, double meuValor2) throws java.rmi.RemoteException{
    if (calculadoraWebservice == null)
      _initCalculadoraWebserviceProxy();
    return calculadoraWebservice.executarmultiplicacao(meuValor1, meuValor2);
  }
  
  
}