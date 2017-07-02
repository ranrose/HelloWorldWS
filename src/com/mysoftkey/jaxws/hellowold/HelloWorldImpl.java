package com.mysoftkey.jaxws.hellowold;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//@WebService(endpointInterface = "com.mysoftkey.jaxws.hellowold.HelloWorld")
@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloWorldImpl implements HelloWorld {

 @WebMethod()
 public String sayHelloWorld(String name) {
  return "Hello world JAX-WS, " + name;
 }

}
