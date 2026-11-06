package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.NotificationChannelPreferences;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NotificationChannelPreferencesSerializer implements JsonSerializer<NotificationChannelPreferences> {
    public static NotificationChannelPreferencesSerializer INSTANCE = new NotificationChannelPreferencesSerializer();
    private final NotificationChannelPreferencesFieldSerializer fieldSerializer = new NotificationChannelPreferencesFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NotificationChannelPreferencesFieldSerializer implements JsonFieldSerializer<NotificationChannelPreferences> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends NotificationChannelPreferences> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.isContentAdded() != null) {
                jsonGenerator.writeFieldName("contentAdded");
                SimpleSerializers.serializeBoolean(u.isContentAdded(), jsonGenerator);
            }
            if (u.isMemberJoined() != null) {
                jsonGenerator.writeFieldName("memberJoined");
                SimpleSerializers.serializeBoolean(u.isMemberJoined(), jsonGenerator);
            }
        }
    }

    private NotificationChannelPreferencesSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(NotificationChannelPreferences notificationChannelPreferences, JsonGenerator jsonGenerator) throws IOException {
        if (notificationChannelPreferences == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.fieldSerializer.serializeFields((NotificationChannelPreferencesFieldSerializer) notificationChannelPreferences, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
