/*
* Base64Util.java    2012-11-20
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.util;

import java.io.UnsupportedEncodingException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


/**
 * TODO Add class description
 * @author yangling
 */
public class Base64Util {
	/**
	 * base64加密string
	 * @param str
	 * @return
	 */
	public static String buildBase64(String str){
		if(str==null || str.length()==0)
			return str;
		byte[] byteArray = null;
		try {
			byteArray = str.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String data = (new BASE64Encoder()).encode(byteArray);
		data = removeNextLine(data);
		return data;
	}
	
	/**
	 * 删除string的回车符和换行符
	 * @param data
	 * @return
	 */
	public static String removeNextLine(String data){
		StringBuffer sb = new StringBuffer(data.length());
		for(int i=0;i<data.length();i++){
			char ch = data.charAt(i);
			if(ch != '\r' && ch !='\n')
				sb.append(ch);
		}
		return sb.toString();
	}
	
	/**
	 * base64解密string
	 * @param code
	 * @return
	 */
	public static String decodeBase64(String code){
		if(code == null || code.length() == 0)
			return code;
		
		BASE64Decoder decoder = new BASE64Decoder(); 
		try { 
			byte[] b = decoder.decodeBuffer(code); 
			return new String(b,"UTF-8"); 
		} catch (Exception e) { 
			return ""; 
		} 
	}
	
	public static byte[] decodeBase64Binary(String code){
		if(code == null || code.length() == 0)
			return null;
		
		BASE64Decoder decoder = new BASE64Decoder(); 
		try { 
			byte[] b = decoder.decodeBuffer(code); 
			return b;
		} catch (Exception e) { 
			return null; 
		} 
	}
}
