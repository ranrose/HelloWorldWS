package com.mysoftkey.jaxws.hellowold;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService // SEI (Service Endpoint interface) SIB (Service Implementation Bean)
public interface HelloWorld {

	//@WebMethod(exclude=true)
	@WebMethod
	public String sayHelloWorld(String name);
}
