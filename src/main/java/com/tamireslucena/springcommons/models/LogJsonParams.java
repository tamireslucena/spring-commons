package com.tamireslucena.springcommons.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class LogJsonParams {

    @JsonProperty(value = "id", required = true)
    private String id;

    @JsonProperty(value = "name", required = true)
    private String name;

    @JsonProperty(value = "age", required = true)
    private Integer age;

    @JsonIgnore
    @JsonProperty(value = "created_at", required = true)
    private LocalDateTime createdAt;

    @JsonIgnore
    @JsonProperty(value = "updated_at", required = true)
    private LocalDateTime updatedAt;

    @JsonProperty(value = "descriptions", required = true)
    private List<LogDescription> descriptions;
}
