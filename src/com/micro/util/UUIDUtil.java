/*
* UUIDUtil.java    2012-12-5
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.util;

import java.util.UUID;


/**
 * TODO Add class description
 * @author yangling
 */
public class UUIDUtil {
	public static String generateUUID(){
		return UUID.randomUUID().toString();
	}
}
