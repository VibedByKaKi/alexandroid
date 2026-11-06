package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazon.comms.ringservice.MetricsSession;
import com.amazonaws.services.cognitoidentity.model.UnprocessedIdentityId;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class UnprocessedIdentityIdJsonUnmarshaller implements Unmarshaller<UnprocessedIdentityId, JsonUnmarshallerContext> {
    private static UnprocessedIdentityIdJsonUnmarshaller instance;

    public static UnprocessedIdentityIdJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UnprocessedIdentityIdJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UnprocessedIdentityId unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UnprocessedIdentityId unprocessedIdentityId = new UnprocessedIdentityId();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("IdentityId")) {
                unprocessedIdentityId.setIdentityId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(MetricsSession.ERROR_CODE_PIVOT)) {
                unprocessedIdentityId.setErrorCode(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return unprocessedIdentityId;
    }
}
