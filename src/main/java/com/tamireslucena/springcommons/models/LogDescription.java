package com.tamireslucena.springcommons.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogDescription {

    @JsonProperty(value = "step", required = true)
    private String step;

    @JsonProperty(value = "timestamp", required = true)
    private String timestamp;

    @JsonProperty(value = "message", required = true)
    private String message;
}
