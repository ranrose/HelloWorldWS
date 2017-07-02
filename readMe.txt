cd %project_home%  
wsgen -s src -d build/classes -cp build/classes com.mysoftkey.jaxws.hellowold.HelloWorldImpl 


copy the compile com folder and paste in any folder and go to that folder and run following command
wsgen -cp . -keep com.mysoftkey.jaxws.hellowold.HelloWorldImpl

copy .java file and paste into existing.jaxws packages of current existing packages

jar file need to add in tomcat server lib

jaxrpc-api-1.1
tomcat-catalina-ws-7.0.5
wsdl4j-1.6.2

and add jaxws-ri related jar file


=================== Steps of writing hello world Java Webservice =================
step #1. create DynamicWeb project in Eclipse

Step #2. copy jar files (jaxb-api.jar, jaxb-impl.jar, jaxws-rt, stax-ex.jar, streambuffer.jar) into application lib (/WEB-INF/lib/) folder. 

Step #3. Write java webservices class

Step #4. write sun-jaxws.xml (java webservices deployment descriptor)

Step #5. generate jaxb classess for input and output typs using wsgen command line utility 
wsgen -s src -d build/classes -cp build/classes com.mysoftkey.jaxws.hellowold.HelloWorldImpl

Step #6. copy generated files into a package of your application

Step #7. deploy the application

============= File: sun-jaxws.xml =================
<?xml version="1.0" encoding="UTF-8"?>
<endpoints xmlns="http://java.sun.com/xml/ns/jax-ws/ri/runtime" version="2.0">
  
  <endpoint
     name="HelloWorldWS"
     implementation="com.mysoftkey.jaxws.hellowold.HelloWorldImpl"
     url-pattern="/HelloWorldWS"/>
     
</endpoints> 

Step #8. access webservice via url: http://localhost:8080/HelloWorldWS/HelloWorldWS?wsdl

Step #9. to generate java client using wsimport
wsimport -keep -verbose http://localhost:8080/HelloWorldWS/HelloWorldWS?wsdl

reference:
https://www.ibm.com/developerworks/library/ws-whichwsdl/index.html

