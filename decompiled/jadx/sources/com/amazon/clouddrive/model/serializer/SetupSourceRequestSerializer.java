package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.SetupSourceRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SetupSourceRequestSerializer implements JsonSerializer<SetupSourceRequest> {
    public static final JsonSerializer<SetupSourceRequest> INSTANCE = new SetupSourceRequestSerializer();

    private SetupSourceRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(SetupSourceRequest setupSourceRequest, JsonGenerator jsonGenerator) throws IOException {
        if (setupSourceRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("sourceVersion");
        SimpleSerializers.serializeString(setupSourceRequest.getSourceVersion(), jsonGenerator);
        jsonGenerator.writeFieldName("deviceFriendlyName");
        SimpleSerializers.serializeString(setupSourceRequest.getDeviceFriendlyName(), jsonGenerator);
        jsonGenerator.writeFieldName("deviceSerialNumber");
        SimpleSerializers.serializeString(setupSourceRequest.getDeviceSerialNumber(), jsonGenerator);
        jsonGenerator.writeFieldName("osVersion");
        SimpleSerializers.serializeString(setupSourceRequest.getOsVersion(), jsonGenerator);
        jsonGenerator.writeFieldName("deviceModel");
        SimpleSerializers.serializeString(setupSourceRequest.getDeviceModel(), jsonGenerator);
        jsonGenerator.writeFieldName("deviceClass");
        SimpleSerializers.serializeString(setupSourceRequest.getDeviceClass(), jsonGenerator);
        jsonGenerator.writeFieldName("devicePlatform");
        SimpleSerializers.serializeString(setupSourceRequest.getDevicePlatform(), jsonGenerator);
        jsonGenerator.writeFieldName("sourceApplicationName");
        SimpleSerializers.serializeString(setupSourceRequest.getSourceApplicationName(), jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
