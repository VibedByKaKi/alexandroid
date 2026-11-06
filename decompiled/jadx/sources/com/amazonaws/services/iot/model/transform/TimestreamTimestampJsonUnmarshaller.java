package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TimestreamTimestamp;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TimestreamTimestampJsonUnmarshaller implements Unmarshaller<TimestreamTimestamp, JsonUnmarshallerContext> {
    private static TimestreamTimestampJsonUnmarshaller instance;

    public static TimestreamTimestampJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TimestreamTimestampJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TimestreamTimestamp unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TimestreamTimestamp timestreamTimestamp = new TimestreamTimestamp();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("value")) {
                timestreamTimestamp.setValue(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("unit")) {
                timestreamTimestamp.setUnit(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return timestreamTimestamp;
    }
}
