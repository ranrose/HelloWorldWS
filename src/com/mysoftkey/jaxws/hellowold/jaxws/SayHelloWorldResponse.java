
package com.mysoftkey.jaxws.hellowold.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "sayHelloWorldResponse", namespace = "http://hellowold.jaxws.mysoftkey.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHelloWorldResponse", namespace = "http://hellowold.jaxws.mysoftkey.com/")
public class SayHelloWorldResponse {

 @XmlElement(name = "return", namespace = "")
 private String _return;

 public String get_return() {
  return this._return;
 }

 public void set_return(String _return) {
  this._return = _return;
 }

}
