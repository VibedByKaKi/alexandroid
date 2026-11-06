package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AssetPropertyVariant;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AssetPropertyVariantJsonUnmarshaller implements Unmarshaller<AssetPropertyVariant, JsonUnmarshallerContext> {
    private static AssetPropertyVariantJsonUnmarshaller instance;

    public static AssetPropertyVariantJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AssetPropertyVariantJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AssetPropertyVariant unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AssetPropertyVariant assetPropertyVariant = new AssetPropertyVariant();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("stringValue")) {
                assetPropertyVariant.setStringValue(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("integerValue")) {
                assetPropertyVariant.setIntegerValue(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("doubleValue")) {
                assetPropertyVariant.setDoubleValue(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("booleanValue")) {
                assetPropertyVariant.setBooleanValue(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return assetPropertyVariant;
    }
}
