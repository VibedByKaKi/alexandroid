package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.cdasdk.cds.common.PhotoSearchCategory;
import com.amazon.clouddrive.model.Settings;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SettingsSerializer implements JsonSerializer<Settings> {
    public static final JsonSerializer<Settings> INSTANCE = new SettingsSerializer();

    private SettingsSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(Settings settings, JsonGenerator jsonGenerator) throws IOException {
        if (settings == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName(PhotoSearchCategory.FAVORITE);
        SimpleSerializers.serializeBoolean(settings.isFavorite(), jsonGenerator);
        jsonGenerator.writeFieldName("hidden");
        SimpleSerializers.serializeBoolean(settings.isHidden(), jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
