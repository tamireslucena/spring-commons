package com.tamireslucena.springcommons.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tamireslucena.springcommons.models.LogDescription;
import com.tamireslucena.springcommons.models.LogJsonParams;
import com.tamireslucena.springcommons.utils.LogJsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping
    public ResponseEntity<String> test() throws JsonProcessingException {

        LogDescription description = LogDescription.builder().step("step").message("message").timestamp("timessss").build();
        LogDescription description2 = LogDescription.builder().step("step").message("message").timestamp("timessss").build();
        List<LogDescription> list = new ArrayList<>();
        list.add(description);
        list.add(description2);

        LogJsonParams logParams = LogJsonParams.builder()
                .id("aaa")
                .name("tata ")
                .age(12)
                .createdAt(new Date())
                .descriptions(list)
                .build();

        LogJsonUtils.info(log, logParams);

        ResponseEntity<String> response = new ResponseEntity<>("não", HttpStatus.OK);
        return response;
    }
}
