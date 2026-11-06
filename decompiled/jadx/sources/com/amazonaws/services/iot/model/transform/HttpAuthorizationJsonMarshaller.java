package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.HttpAuthorization;
import com.amazonaws.services.iot.model.SigV4Authorization;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class HttpAuthorizationJsonMarshaller {
    private static HttpAuthorizationJsonMarshaller instance;

    public static HttpAuthorizationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HttpAuthorizationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HttpAuthorization httpAuthorization, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (httpAuthorization.getSigv4() != null) {
            SigV4Authorization sigv4 = httpAuthorization.getSigv4();
            awsJsonWriter.name("sigv4");
            SigV4AuthorizationJsonMarshaller.getInstance().marshall(sigv4, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
