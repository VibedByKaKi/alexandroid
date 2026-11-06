package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.Notifications;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NotificationsSerializer implements JsonSerializer<Notifications> {
    public static NotificationsSerializer INSTANCE = new NotificationsSerializer();
    private final NotificationsFieldSerializer fieldSerializer = new NotificationsFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NotificationsFieldSerializer implements JsonFieldSerializer<Notifications> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends Notifications> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.isMuted() != null) {
                jsonGenerator.writeFieldName("muted");
                SimpleSerializers.serializeBoolean(u.isMuted(), jsonGenerator);
            }
            if (u.getPush() != null) {
                jsonGenerator.writeFieldName("push");
                NotificationChannelPreferencesSerializer.INSTANCE.serialize(u.getPush(), jsonGenerator);
            }
            if (u.getEmail() != null) {
                jsonGenerator.writeFieldName("email");
                NotificationChannelPreferencesSerializer.INSTANCE.serialize(u.getEmail(), jsonGenerator);
            }
        }
    }

    private NotificationsSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(Notifications notifications, JsonGenerator jsonGenerator) throws IOException {
        if (notifications == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.fieldSerializer.serializeFields((NotificationsFieldSerializer) notifications, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
