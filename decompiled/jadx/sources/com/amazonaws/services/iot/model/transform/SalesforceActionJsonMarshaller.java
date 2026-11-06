package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.SalesforceAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SalesforceActionJsonMarshaller {
    private static SalesforceActionJsonMarshaller instance;

    public static SalesforceActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SalesforceActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SalesforceAction salesforceAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (salesforceAction.getToken() != null) {
            String token = salesforceAction.getToken();
            awsJsonWriter.name("token");
            awsJsonWriter.value(token);
        }
        if (salesforceAction.getUrl() != null) {
            String url = salesforceAction.getUrl();
            awsJsonWriter.name("url");
            awsJsonWriter.value(url);
        }
        awsJsonWriter.endObject();
    }
}
