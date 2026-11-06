package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.ProviderUserIdentifierType;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ProviderUserIdentifierTypeJsonUnmarshaller implements Unmarshaller<ProviderUserIdentifierType, JsonUnmarshallerContext> {
    private static ProviderUserIdentifierTypeJsonUnmarshaller instance;

    public static ProviderUserIdentifierTypeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ProviderUserIdentifierTypeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ProviderUserIdentifierType unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProviderUserIdentifierType providerUserIdentifierType = new ProviderUserIdentifierType();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("ProviderName")) {
                providerUserIdentifierType.setProviderName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("ProviderAttributeName")) {
                providerUserIdentifierType.setProviderAttributeName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("ProviderAttributeValue")) {
                providerUserIdentifierType.setProviderAttributeValue(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return providerUserIdentifierType;
    }
}
