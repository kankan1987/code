package com.utils;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class HttpClientUtil1 {
	
	public static String get(String url) {
		HttpClient httpClient = HttpClients.createDefault();
		String body = null;
		
		System.out.println("http->" + url);
		HttpGet get = new HttpGet(url);
		
		
		return null;
	}
}
