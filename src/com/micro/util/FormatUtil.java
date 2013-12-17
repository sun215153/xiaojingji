/*
* Constants.java    2012-10-31
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.util;

/**
 * TODO Add class description
 * @author yangling
 */
public class FormatUtil {
	
	public static int parseInt(String str){
		if(StringUtil.isEmpty(str)) return 0;
		try{
			return Integer.parseInt(str);
		}catch(Exception e){
			return -1;
		}
	}
	
	public static long parseLong(String str){
		if(StringUtil.isEmpty(str)) return 0;
		try{
			return Long.parseLong(str);
		}catch(Exception e){
			return -1;
		}
	}
	
	
}
