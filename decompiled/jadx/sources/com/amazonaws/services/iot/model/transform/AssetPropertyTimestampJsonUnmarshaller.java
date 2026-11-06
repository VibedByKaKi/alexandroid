package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AssetPropertyTimestamp;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AssetPropertyTimestampJsonUnmarshaller implements Unmarshaller<AssetPropertyTimestamp, JsonUnmarshallerContext> {
    private static AssetPropertyTimestampJsonUnmarshaller instance;

    public static AssetPropertyTimestampJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AssetPropertyTimestampJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AssetPropertyTimestamp unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AssetPropertyTimestamp assetPropertyTimestamp = new AssetPropertyTimestamp();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("timeInSeconds")) {
                assetPropertyTimestamp.setTimeInSeconds(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("offsetInNanos")) {
                assetPropertyTimestamp.setOffsetInNanos(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return assetPropertyTimestamp;
    }
}
