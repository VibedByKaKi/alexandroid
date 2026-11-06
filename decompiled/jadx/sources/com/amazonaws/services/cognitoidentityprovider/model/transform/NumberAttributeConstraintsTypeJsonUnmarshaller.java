package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.NumberAttributeConstraintsType;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class NumberAttributeConstraintsTypeJsonUnmarshaller implements Unmarshaller<NumberAttributeConstraintsType, JsonUnmarshallerContext> {
    private static NumberAttributeConstraintsTypeJsonUnmarshaller instance;

    public static NumberAttributeConstraintsTypeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new NumberAttributeConstraintsTypeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public NumberAttributeConstraintsType unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NumberAttributeConstraintsType numberAttributeConstraintsType = new NumberAttributeConstraintsType();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("MinValue")) {
                numberAttributeConstraintsType.setMinValue(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("MaxValue")) {
                numberAttributeConstraintsType.setMaxValue(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return numberAttributeConstraintsType;
    }
}
