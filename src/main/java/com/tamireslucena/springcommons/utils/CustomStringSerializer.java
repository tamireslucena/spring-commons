package com.tamireslucena.springcommons.utils;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class CustomStringSerializer extends StdSerializer<String> {

    public CustomStringSerializer() {
        this(null);
    }

    public CustomStringSerializer(Class<String> t) {
        super(t);
    }

    @Override
    public void serialize(
            String value, JsonGenerator gen, SerializerProvider arg2)
            throws IOException, JsonProcessingException {
        gen.writeString(value.trim());
    }
}