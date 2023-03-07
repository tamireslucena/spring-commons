package com.tamireslucena.springcommons.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogDescription {

    @JsonProperty(value = "step", required = true)
    private String step;

    @JsonProperty(value = "timestamp", required = true)
    private String timestamp;

    @JsonProperty(value = "message", required = true)
    private String message;
}
