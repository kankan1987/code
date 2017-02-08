package com.main;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.model.LoginModel;
import com.utils.HttpClientUtil;

public class LoginMain {
	public static void main(String[] args) {
		LoginModel loginModel = new LoginModel();
		loginModel.setJsType("1");
		loginModel.setJsVer("10190");
		loginModel.setLoginSig("kP2b5qoIKQ*yQnln99ymr5LCFHDmAhUsPYcPO5sH0oZqyG2ycL74FGNXjBMdITTd");
	
		loginModel.setAppid("549000912");
		loginModel.setPtTea("2");
		loginModel.setPtUistyle("40");
		loginModel.setPtVcode("1");
		loginModel.setR("0.04891137651351185");
		loginModel.setUin("799062142");
		
		String step1Url = loginModel.getStepFirstUrl();
		try {
			System.out.println("第一步:" + step1Url);
			String body = HttpClientUtil.get(step1Url);
			System.out.println("返回值:" + body);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// step2
		loginModel.setAction("5-27-1483342912358");
		loginModel.setAid("549000912");
		loginModel.setDaid("5");
		loginModel.setFromUi("1");
		loginModel.setG("1");
		loginModel.setH("1");
		loginModel.setP("dpjSnluuBRQvCMZaYknblNXP0bJB4Xbw995atRCSfOH2lZJLxl8IDFxSzY09GGqc4svp6NK44JANtsp56Eak2yMvzn*JeP-G0WlWQv4Tm3I7oXZQA1VwhnDzWsIWjMoqvepRMCvcHhTFQrG5htulkGH4N2hZ-a3ZVlCQqK4BOhzHfEW6CFaBPqUn*qj*qEggKcc1NrkzaS6nRyaaKFfX1c2p6okn*H*vdQDi1CBOdeOmY7sQChevY0ZLGj6WYPwBgMGYpGPLSItUqkxDosUKFXgCgwBVKl--dYJbbtz4vG3T3qPgcUGla*wonU06DZjjy35pDkHmAxtg-HXh*QPQfg__");;
		loginModel.setPtRandsalt("2");
		loginModel.setPtUistyle("40");
		loginModel.setPtVcodeV1("0");
		loginModel.setPtVerifysessionV1("58a1ee962d74f0e2f67963f7c7f06ed63ab17903a050077540c520c47037d896a62386516be90f48536d343761384c680f9f74932a3aaa0a");
		loginModel.setPtlang("2052");
		loginModel.setPtredirect("0");
		loginModel.setT("1");
		loginModel.setU("497716195");
		loginModel.setVerifycode("!ACF");
	}
}
