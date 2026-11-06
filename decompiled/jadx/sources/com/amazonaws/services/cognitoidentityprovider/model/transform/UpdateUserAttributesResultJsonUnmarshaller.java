package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.UpdateUserAttributesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateUserAttributesResultJsonUnmarshaller implements Unmarshaller<UpdateUserAttributesResult, JsonUnmarshallerContext> {
    private static UpdateUserAttributesResultJsonUnmarshaller instance;

    public static UpdateUserAttributesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateUserAttributesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UpdateUserAttributesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        UpdateUserAttributesResult updateUserAttributesResult = new UpdateUserAttributesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("CodeDeliveryDetailsList")) {
                updateUserAttributesResult.setCodeDeliveryDetailsList(new ListUnmarshaller(CodeDeliveryDetailsTypeJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return updateUserAttributesResult;
    }
}
