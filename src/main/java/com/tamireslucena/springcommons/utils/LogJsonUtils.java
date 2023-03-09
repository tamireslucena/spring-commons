package com.tamireslucena.springcommons.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tamireslucena.springcommons.models.LogJsonParams;
import org.slf4j.Logger;

public class LogJsonUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();

     public static void info(Logger log, LogJsonParams params) throws JsonProcessingException {
        log.info(LogSanitizerUtil.sanitize(toJson(params)));
    }

    private static String toJson(LogJsonParams params) throws JsonProcessingException {
        return objectMapper.writeValueAsString(params);
    }
}


