package com.micro.web.util;
import java.util.regex.Pattern;

/**
 * TODO Add class description
 * @author heqi
 */
public class StringUtil {

    public static final Pattern NUMBER_PATTERN = Pattern.compile("(?:-|\\+)?\\d+(?:\\.\\d+)?");

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isNumber(String str) {
        return !isEmpty(str) && NUMBER_PATTERN.matcher(str).matches();
    }

    public static int parseInt(String intStr) {
        return parseInt(intStr, 0);
    }

    public static int parseInt(String intStr, int defaultInt) {
        if (isEmpty(intStr) || !isNumber(intStr)) return defaultInt;
        try {
            return Integer.parseInt(intStr);
        } catch (NumberFormatException e) {
            return defaultInt;
        }
    }
    
    public static long parseLong(String intStr) {
        return parseLong(intStr, 0);
    }
    
    public static long parseLong(String intStr, long defaultInt) {
        if (isEmpty(intStr) || !isNumber(intStr)) return defaultInt;
        try {
            return Long.parseLong(intStr);
        } catch (NumberFormatException e) {
            return defaultInt;
        }
    }
    
    public static float parseFloat(String intStr) {
        return parseFloat(intStr, 0);
    }
    
    public static float parseFloat(String intStr, float defaultInt) {
        if (isEmpty(intStr) || !isNumber(intStr)) return defaultInt;
        try {
            return Float.parseFloat(intStr);
        } catch (NumberFormatException e) {
            return defaultInt;
        }
    }
    
    public static byte parseByte(String intStr) {
        return parseByte(intStr, (byte)0);
    }
    
    public static byte parseByte(String intStr, byte defaultInt) {
        if (isEmpty(intStr) || !isNumber(intStr)) return defaultInt;
        try {
            return Byte.parseByte(intStr);
        } catch (NumberFormatException e) {
            return defaultInt;
        }
    }
    
	public static boolean isStr(String str){
	    	if(str == null || str.trim().length() ==0){
	    		return false;
	    	}
	    	return true;
	}
	
	
}
