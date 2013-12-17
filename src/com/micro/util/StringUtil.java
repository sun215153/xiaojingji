/*
* PagenationTag.java    2012-11-1
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.util;
import java.util.regex.Pattern;

/**
 * TODO Add class description
 * @author yangling
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

    public static void main(String[] args) {
        System.out.println(isNumber("09"));
        System.out.println(isNumber("+09"));
        System.out.println(isNumber("-09"));
        System.out.println(isNumber("-09."));
        System.out.println(isNumber("-09.."));
        System.out.println(isNumber("-09.11"));
        System.out.println(isNumber("09.11"));
        System.out.println(isNumber("0099d"));
        System.out.println(isNumber("a0099"));
        System.out.println(isNumber(""));
        System.out.println(isNumber(null));
    }
}
