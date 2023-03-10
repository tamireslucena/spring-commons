package com.tamireslucena.springcommons.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tamireslucena.springcommons.enums.MaskPosition;
import com.tamireslucena.springcommons.enums.TypeOfData;
import com.tamireslucena.springcommons.models.LogDescription;
import com.tamireslucena.springcommons.models.LogJsonParams;
import com.tamireslucena.springcommons.utils.LogJsonUtils;
import com.tamireslucena.springcommons.utils.MaskData;
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

        String maskData = MaskData.maskData(TypeOfData.OTHER, 3, MaskPosition.RIGHT, "Pedrinho pintão");
        System.out.println(maskData);

        String maskData2 = MaskData.maskData(TypeOfData.DOCUMENT, 5, MaskPosition.LEFT, " ");
        System.out.println(maskData2);

        String maskData3 = MaskData.maskData(TypeOfData.DOCUMENT, 1, MaskPosition.LEFT, "421");
        System.out.println(maskData3);

        String maskData4 = MaskData.maskData(TypeOfData.DOCUMENT, 1, MaskPosition.LEFT, "42110589833");
        System.out.println(maskData4);

        String maskData5 = MaskData.maskData(TypeOfData.OTHER, 10, MaskPosition.RIGHT, "Pedri");
        System.out.println(maskData5);


        ResponseEntity<String> response = new ResponseEntity<>("não", HttpStatus.OK);
        return response;
    }
}
