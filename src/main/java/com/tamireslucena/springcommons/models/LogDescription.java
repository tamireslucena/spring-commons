package com.tamireslucena.springcommons.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogDescription {

    @JsonProperty("step")
    private String step;

    @JsonProperty(value = "timestamp")
    private String timestamp;

    @JsonProperty("message")
    private String message;
}
