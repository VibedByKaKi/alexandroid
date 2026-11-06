package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuthorizerConfig;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuthorizerConfigJsonUnmarshaller implements Unmarshaller<AuthorizerConfig, JsonUnmarshallerContext> {
    private static AuthorizerConfigJsonUnmarshaller instance;

    public static AuthorizerConfigJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AuthorizerConfigJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AuthorizerConfig unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuthorizerConfig authorizerConfig = new AuthorizerConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("defaultAuthorizerName")) {
                authorizerConfig.setDefaultAuthorizerName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("allowAuthorizerOverride")) {
                authorizerConfig.setAllowAuthorizerOverride(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return authorizerConfig;
    }
}
