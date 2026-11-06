package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.HttpHeader;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class HttpHeaderJsonMarshaller {
    private static HttpHeaderJsonMarshaller instance;

    public static HttpHeaderJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HttpHeaderJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HttpHeader httpHeader, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (httpHeader.getHeaderName() != null) {
            String headerName = httpHeader.getHeaderName();
            awsJsonWriter.name("headerName");
            awsJsonWriter.value(headerName);
        }
        if (httpHeader.getHeaderValue() != null) {
            String headerValue = httpHeader.getHeaderValue();
            awsJsonWriter.name("headerValue");
            awsJsonWriter.value(headerValue);
        }
        awsJsonWriter.endObject();
    }
}
