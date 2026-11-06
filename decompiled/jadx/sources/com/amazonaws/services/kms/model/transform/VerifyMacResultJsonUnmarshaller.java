package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.VerifyMacResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class VerifyMacResultJsonUnmarshaller implements Unmarshaller<VerifyMacResult, JsonUnmarshallerContext> {
    private static VerifyMacResultJsonUnmarshaller instance;

    public static VerifyMacResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new VerifyMacResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public VerifyMacResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        VerifyMacResult verifyMacResult = new VerifyMacResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("KeyId")) {
                verifyMacResult.setKeyId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("MacValid")) {
                verifyMacResult.setMacValid(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("MacAlgorithm")) {
                verifyMacResult.setMacAlgorithm(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return verifyMacResult;
    }
}
