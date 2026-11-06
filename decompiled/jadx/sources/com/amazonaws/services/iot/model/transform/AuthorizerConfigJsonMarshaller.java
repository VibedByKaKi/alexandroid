package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuthorizerConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuthorizerConfigJsonMarshaller {
    private static AuthorizerConfigJsonMarshaller instance;

    public static AuthorizerConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AuthorizerConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AuthorizerConfig authorizerConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (authorizerConfig.getDefaultAuthorizerName() != null) {
            String defaultAuthorizerName = authorizerConfig.getDefaultAuthorizerName();
            awsJsonWriter.name("defaultAuthorizerName");
            awsJsonWriter.value(defaultAuthorizerName);
        }
        if (authorizerConfig.getAllowAuthorizerOverride() != null) {
            Boolean allowAuthorizerOverride = authorizerConfig.getAllowAuthorizerOverride();
            awsJsonWriter.name("allowAuthorizerOverride");
            awsJsonWriter.value(allowAuthorizerOverride.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
