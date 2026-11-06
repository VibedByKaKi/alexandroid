package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.CustomEmailLambdaVersionConfigType;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CustomEmailLambdaVersionConfigTypeJsonUnmarshaller implements Unmarshaller<CustomEmailLambdaVersionConfigType, JsonUnmarshallerContext> {
    private static CustomEmailLambdaVersionConfigTypeJsonUnmarshaller instance;

    public static CustomEmailLambdaVersionConfigTypeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CustomEmailLambdaVersionConfigTypeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CustomEmailLambdaVersionConfigType unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CustomEmailLambdaVersionConfigType customEmailLambdaVersionConfigType = new CustomEmailLambdaVersionConfigType();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("LambdaVersion")) {
                customEmailLambdaVersionConfigType.setLambdaVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("LambdaArn")) {
                customEmailLambdaVersionConfigType.setLambdaArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return customEmailLambdaVersionConfigType;
    }
}
