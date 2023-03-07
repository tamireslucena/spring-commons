package com.tamireslucena.springcommons.utils;

import org.slf4j.Logger;

public class LogJsonUtils {
    public static void info(Logger log, String message){
        log.info(LogSanitizerUtil.sanitize(message));
    }

    public static void info(Logger log, String message, Object... object){
        info(log, LogSanitizerUtil.sanitize(String.format(message, object)));
    }
}
