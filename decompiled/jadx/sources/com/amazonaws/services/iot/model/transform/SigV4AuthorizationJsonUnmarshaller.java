package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.SigV4Authorization;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SigV4AuthorizationJsonUnmarshaller implements Unmarshaller<SigV4Authorization, JsonUnmarshallerContext> {
    private static SigV4AuthorizationJsonUnmarshaller instance;

    public static SigV4AuthorizationJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SigV4AuthorizationJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SigV4Authorization unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SigV4Authorization sigV4Authorization = new SigV4Authorization();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("signingRegion")) {
                sigV4Authorization.setSigningRegion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("serviceName")) {
                sigV4Authorization.setServiceName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("roleArn")) {
                sigV4Authorization.setRoleArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return sigV4Authorization;
    }
}
