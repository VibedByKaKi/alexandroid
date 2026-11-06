package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.MultiRegionKey;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MultiRegionKeyJsonUnmarshaller implements Unmarshaller<MultiRegionKey, JsonUnmarshallerContext> {
    private static MultiRegionKeyJsonUnmarshaller instance;

    public static MultiRegionKeyJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new MultiRegionKeyJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public MultiRegionKey unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MultiRegionKey multiRegionKey = new MultiRegionKey();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("Arn")) {
                multiRegionKey.setArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Region")) {
                multiRegionKey.setRegion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return multiRegionKey;
    }
}
