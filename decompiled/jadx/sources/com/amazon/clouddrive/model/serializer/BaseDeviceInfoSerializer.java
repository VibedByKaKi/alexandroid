package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.BaseDeviceInfo;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BaseDeviceInfoSerializer implements JsonSerializer<BaseDeviceInfo> {
    public static final JsonSerializer<BaseDeviceInfo> INSTANCE = new BaseDeviceInfoSerializer();

    private BaseDeviceInfoSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(BaseDeviceInfo baseDeviceInfo, JsonGenerator jsonGenerator) throws IOException {
        if (baseDeviceInfo == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("deviceModel");
        SimpleSerializers.serializeString(baseDeviceInfo.getDeviceModel(), jsonGenerator);
        jsonGenerator.writeFieldName("creationTime");
        SimpleSerializers.serializeString(baseDeviceInfo.getCreationTime(), jsonGenerator);
        jsonGenerator.writeFieldName("deviceId");
        SimpleSerializers.serializeString(baseDeviceInfo.getDeviceId(), jsonGenerator);
        jsonGenerator.writeFieldName("deviceStatus");
        SimpleSerializers.serializeString(baseDeviceInfo.getDeviceStatus(), jsonGenerator);
        jsonGenerator.writeFieldName("devicePlatform");
        SimpleSerializers.serializeString(baseDeviceInfo.getDevicePlatform(), jsonGenerator);
        jsonGenerator.writeFieldName("deviceClass");
        SimpleSerializers.serializeString(baseDeviceInfo.getDeviceClass(), jsonGenerator);
        jsonGenerator.writeFieldName("osVersionHistory");
        VersionHistoryMapSerializer.INSTANCE.serialize(baseDeviceInfo.getOsVersionHistory(), jsonGenerator);
        jsonGenerator.writeFieldName("deviceFriendlyName");
        SimpleSerializers.serializeString(baseDeviceInfo.getDeviceFriendlyName(), jsonGenerator);
        jsonGenerator.writeFieldName("lastModifiedTime");
        SimpleSerializers.serializeString(baseDeviceInfo.getLastModifiedTime(), jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
