package com.tamireslucena.springcommons.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tamireslucena.springcommons.utils.CustomDateSerializer;
import com.tamireslucena.springcommons.utils.CustomStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogJsonParams {

    @JsonProperty(value = "id", required = true)
    private String id;

    @JsonSerialize(using = CustomStringSerializer.class)
    @JsonProperty(value = "name", required = true)
    private String name;

    @JsonProperty(value = "age", required = true)
    private Integer age;

    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "dd-MM-yyyy hh:mm:ss")
    @JsonProperty(value = "created_at", required = true)
    private Date createdAt;

    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonProperty(value = "updated_at", required = true)
    private Date updatedAt;

    @JsonProperty(value = "descriptions", required = true)
    private List<LogDescription> descriptions;

}
