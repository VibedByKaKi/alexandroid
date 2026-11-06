package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.CodeDeliveryDetailsType;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;
import org.apache.http.HttpHeaders;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CodeDeliveryDetailsTypeJsonUnmarshaller implements Unmarshaller<CodeDeliveryDetailsType, JsonUnmarshallerContext> {
    private static CodeDeliveryDetailsTypeJsonUnmarshaller instance;

    public static CodeDeliveryDetailsTypeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CodeDeliveryDetailsTypeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CodeDeliveryDetailsType unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CodeDeliveryDetailsType codeDeliveryDetailsType = new CodeDeliveryDetailsType();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(HttpHeaders.DESTINATION)) {
                codeDeliveryDetailsType.setDestination(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("DeliveryMedium")) {
                codeDeliveryDetailsType.setDeliveryMedium(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("AttributeName")) {
                codeDeliveryDetailsType.setAttributeName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return codeDeliveryDetailsType;
    }
}
