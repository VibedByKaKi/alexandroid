package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.SetUICustomizationResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetUICustomizationResultJsonUnmarshaller implements Unmarshaller<SetUICustomizationResult, JsonUnmarshallerContext> {
    private static SetUICustomizationResultJsonUnmarshaller instance;

    public static SetUICustomizationResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SetUICustomizationResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SetUICustomizationResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        SetUICustomizationResult setUICustomizationResult = new SetUICustomizationResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("UICustomization")) {
                setUICustomizationResult.setUICustomization(UICustomizationTypeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return setUICustomizationResult;
    }
}
