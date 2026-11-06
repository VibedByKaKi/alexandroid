package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Configuration;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ConfigurationJsonUnmarshaller implements Unmarshaller<Configuration, JsonUnmarshallerContext> {
    private static ConfigurationJsonUnmarshaller instance;

    public static ConfigurationJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ConfigurationJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Configuration unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Configuration configuration = new Configuration();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Enabled")) {
                configuration.setEnabled(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return configuration;
    }
}
