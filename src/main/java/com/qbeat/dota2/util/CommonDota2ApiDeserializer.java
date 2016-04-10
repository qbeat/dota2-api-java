package com.qbeat.dota2.util;

import com.google.gson.*;

import java.lang.reflect.Type;

public class CommonDota2ApiDeserializer<T> implements JsonDeserializer<T> {

    @Override
    public T deserialize(JsonElement je, Type type, JsonDeserializationContext context)
            throws JsonParseException {
        JsonElement content = je.getAsJsonObject().get("result");

        return new Gson().fromJson(content, type);
    }
}
