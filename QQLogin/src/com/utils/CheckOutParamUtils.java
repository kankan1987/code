package com.utils;

import org.apache.commons.lang3.StringUtils;

public class CheckOutParamUtils {
	private static String[] ptuiCheckVC(String str) {
		//ptui_checkVC('0',
		//'!ACF','\x00\x00\x00\x00\x1d\xaa\x8b\xe3',
		//'58a1ee962d74f0e2f67963f7c7f06ed63ab17903a050077540c520c47037d896a62386516be90f48536d343761384c680f9f74932a3aaa0a'
		//,'2')
		if(StringUtils.isNoneBlank(str) && str.indexOf("ptui_checkVC") > -1) {
			String str1 = str.replace("ptui_checkVC(", "");
			String str2 = str1.replace(")", "");
			String str3 = str2.replace("'", "");
			System.out.println(str3);
			return str3.split(",");
		}
		
		return null;
	}
	
	//ptuiCB('3','0','','0','您输入的帐号或密码不正确，请重新输入。', '')
	private static String[] ptuiCB(String str) {
		if (StringUtils.isNoneBlank(str) && str.indexOf(str) > -1) {
			String str1 = str.replace("ptuiCB(", "");
			String str2 = str1.replace(")", "");
			String str3 = str2.replace("'", "");
			System.out.println(str3);
			return str3.split(",");
		}
		
		return null;
	}
	
	public static void main(String[] args) {
//		String test="ptui_checkVC('0','!ACF','\\x00\\x00\\x00\\x00\\x1d\\xaa\\x8b\\xe3','58a1ee962d74f0e2f67963f7c7f06ed63ab17903a050077540c520c47037d896a62386516be90f48536d343761384c680f9f74932a3aaa0a','2')";
//		String[]  result = ptuiCheckVC(test);
//		for (String s:result) {
//			System.out.println(s);
//		}
		String test = "ptuiCB('3','0','','0','您输入的帐号或密码不正确，请重新输入。', '')";
		String[]  result = ptuiCB(test);
		for (String s:result) {
			System.out.println(s);
		}
	}
}
