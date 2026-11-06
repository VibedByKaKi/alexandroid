package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.UserAttributeUpdateSettingsType;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class UserAttributeUpdateSettingsTypeJsonUnmarshaller implements Unmarshaller<UserAttributeUpdateSettingsType, JsonUnmarshallerContext> {
    private static UserAttributeUpdateSettingsTypeJsonUnmarshaller instance;

    public static UserAttributeUpdateSettingsTypeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UserAttributeUpdateSettingsTypeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UserAttributeUpdateSettingsType unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserAttributeUpdateSettingsType userAttributeUpdateSettingsType = new UserAttributeUpdateSettingsType();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("AttributesRequireVerificationBeforeUpdate")) {
                userAttributeUpdateSettingsType.setAttributesRequireVerificationBeforeUpdate(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userAttributeUpdateSettingsType;
    }
}
