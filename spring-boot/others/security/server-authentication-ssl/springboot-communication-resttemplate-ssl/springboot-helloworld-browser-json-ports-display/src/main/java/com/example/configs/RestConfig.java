package com.example.configs;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;

@Configuration
public class RestConfig {
	
	@Value("${truststore.path}")
	private String truststorePath;
	
	@Value("${truststore.password}")
	private String truststorePassword;
	
	@Bean
	public RestTemplate restTemplate() throws Exception {
		
	    SSLContext sslContext = new SSLContextBuilder()
	      .loadTrustMaterial(ResourceUtils.getFile(truststorePath), truststorePassword.toCharArray())
	      .build();
	    
	    SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext);
	    
	    HttpClient httpClient = HttpClients.custom()
	      .setSSLSocketFactory(socketFactory)
	      .build();
	    
	    HttpComponentsClientHttpRequestFactory factory = 
	      new HttpComponentsClientHttpRequestFactory(httpClient);
	    
	    return new RestTemplate(factory);
	}

}