package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ValidateSecurityProfileBehaviorsResultJsonUnmarshaller implements Unmarshaller<ValidateSecurityProfileBehaviorsResult, JsonUnmarshallerContext> {
    private static ValidateSecurityProfileBehaviorsResultJsonUnmarshaller instance;

    public static ValidateSecurityProfileBehaviorsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ValidateSecurityProfileBehaviorsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ValidateSecurityProfileBehaviorsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ValidateSecurityProfileBehaviorsResult validateSecurityProfileBehaviorsResult = new ValidateSecurityProfileBehaviorsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("valid")) {
                validateSecurityProfileBehaviorsResult.setValid(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("validationErrors")) {
                validateSecurityProfileBehaviorsResult.setValidationErrors(new ListUnmarshaller(ValidationErrorJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return validateSecurityProfileBehaviorsResult;
    }
}
