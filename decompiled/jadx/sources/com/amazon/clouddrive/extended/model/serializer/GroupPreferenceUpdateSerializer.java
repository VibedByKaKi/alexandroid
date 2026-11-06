package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.GroupPreferenceUpdate;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupPreferenceUpdateSerializer implements JsonSerializer<GroupPreferenceUpdate> {
    public static final JsonSerializer<GroupPreferenceUpdate> INSTANCE = new GroupPreferenceUpdateSerializer();

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GroupPreferenceUpdate groupPreferenceUpdate, JsonGenerator jsonGenerator) throws IOException {
        if (groupPreferenceUpdate == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        if (groupPreferenceUpdate.getId() != null) {
            jsonGenerator.writeFieldName("id");
            SimpleSerializers.serializeString(groupPreferenceUpdate.getId(), jsonGenerator);
        }
        if (groupPreferenceUpdate.getValue() != null) {
            jsonGenerator.writeFieldName("value");
            SimpleSerializers.serializeString(groupPreferenceUpdate.getValue(), jsonGenerator);
        }
        jsonGenerator.writeEndObject();
    }
}
