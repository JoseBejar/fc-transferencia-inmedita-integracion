package org.fmbbva.movcli.fc.transferencia.inmediata.soap.config;

import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.ClientSoap;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.EchoTestSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {
	
	@Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("org.tempuri.action");
        //marshaller.setContextPath("com.soap.wsdl");
        return marshaller;
    }

	 @Bean
	    public ClientSoap getSoapClient(Jaxb2Marshaller marshaller){
		 	ClientSoap soapClient = new ClientSoap();
	        //soapClient.setDefaultUri("https://btdes.cnpdes.local:9443/desarrollo/servlet/com.dlya.bantotal.awsbtrecepciontin");
		 	//soapClient.setDefaultUri("https://172.20.6.15:9443/desarrollo/servlet/com.dlya.bantotal.awsbtrecepciontin");
	        soapClient.setMarshaller(marshaller);
	        soapClient.setUnmarshaller(marshaller);

	        return soapClient;
	    }


		 @Bean
		    public EchoTestSoap getEchoTestSoap(Jaxb2Marshaller marshaller){
			 	EchoTestSoap echoTestSoap = new EchoTestSoap();
			 	//echoTestSoap.setDefaultUri("https://btdes.cnpdes.local:9443/desarrollo/servlet/com.dlya.bantotal.awsbthabilitartin");
			 	echoTestSoap.setDefaultUri("https://172.20.6.15:9443/desarrollo/servlet/com.dlya.bantotal.awsbthabilitartin");
			 	echoTestSoap.setMarshaller(marshaller);
			 	echoTestSoap.setUnmarshaller(marshaller);

		        return echoTestSoap;
		    }
}
