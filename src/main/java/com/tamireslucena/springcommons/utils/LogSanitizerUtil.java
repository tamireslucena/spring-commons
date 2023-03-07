package com.tamireslucena.springcommons.utils;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;

import java.util.regex.Pattern;

public class LogSanitizerUtil {

    public static String sanitize(String message){
        return sanitize("sanitizing", message);
    }

    public static String sanitize(String local, String value){
        if(value != null){
            value = value.replaceAll("\0", "");

            for(Pattern scriptPattern: patterns){
                if(scriptPattern.matcher(value).find()){
                    value = scriptPattern.matcher(value).replaceAll("");
                    throw new IllegalArgumentException(local + ". inválido.");
                }
            }
        }
        return value;
    }

    private static Pattern[] patterns = new Pattern[]{
            Pattern.compile("<script>(.*?)</script>", Pattern.CASE_INSENSITIVE),
            Pattern.compile("src[\r\n]*=[\r\n]*\\\"(.*?)\\\"", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL)
    };

}
