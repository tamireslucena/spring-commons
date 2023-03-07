package com.tamireslucena.springcommons.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class LogJsonParams {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private Integer age;

    @JsonIgnore
    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonIgnore
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;

    @JsonProperty("descriptions")
    private List<LogDescription> descriptions;
}
