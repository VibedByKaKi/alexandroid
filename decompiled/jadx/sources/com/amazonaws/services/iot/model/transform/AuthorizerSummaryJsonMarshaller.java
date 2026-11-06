package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuthorizerSummary;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuthorizerSummaryJsonMarshaller {
    private static AuthorizerSummaryJsonMarshaller instance;

    public static AuthorizerSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AuthorizerSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AuthorizerSummary authorizerSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (authorizerSummary.getAuthorizerName() != null) {
            String authorizerName = authorizerSummary.getAuthorizerName();
            awsJsonWriter.name("authorizerName");
            awsJsonWriter.value(authorizerName);
        }
        if (authorizerSummary.getAuthorizerArn() != null) {
            String authorizerArn = authorizerSummary.getAuthorizerArn();
            awsJsonWriter.name("authorizerArn");
            awsJsonWriter.value(authorizerArn);
        }
        awsJsonWriter.endObject();
    }
}
