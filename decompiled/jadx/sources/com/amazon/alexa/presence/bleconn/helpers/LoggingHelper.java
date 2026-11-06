package com.amazon.alexa.presence.bleconn.helpers;

import com.amazon.alexa.accessory.internal.util.DeviceDatabaseUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.text.DateFormat;
import java.util.Locale;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class LoggingHelper {
    private static final ObjectMapper MAPPER;

    static {
        ObjectMapper objectMapper = new ObjectMapper();
        MAPPER = objectMapper;
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.setDateFormat(DateFormat.getDateTimeInstance(2, 2, Locale.getDefault()));
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    private LoggingHelper() {
    }

    public static String dump(Object obj) {
        try {
            return MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static String indent(String str) {
        return indentAfterLinebreaks(DeviceDatabaseUtils.DELIMITER + str);
    }

    public static String indentAfterLinebreaks(String str) {
        return str.replaceAll("\n", "\n\t");
    }
}
