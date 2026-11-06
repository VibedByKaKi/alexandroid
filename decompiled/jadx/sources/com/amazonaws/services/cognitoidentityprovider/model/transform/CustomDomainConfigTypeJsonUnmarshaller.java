package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.CustomDomainConfigType;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CustomDomainConfigTypeJsonUnmarshaller implements Unmarshaller<CustomDomainConfigType, JsonUnmarshallerContext> {
    private static CustomDomainConfigTypeJsonUnmarshaller instance;

    public static CustomDomainConfigTypeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CustomDomainConfigTypeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CustomDomainConfigType unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CustomDomainConfigType customDomainConfigType = new CustomDomainConfigType();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("CertificateArn")) {
                customDomainConfigType.setCertificateArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return customDomainConfigType;
    }
}
