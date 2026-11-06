package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.HttpContext;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class HttpContextJsonMarshaller {
    private static HttpContextJsonMarshaller instance;

    public static HttpContextJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HttpContextJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HttpContext httpContext, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (httpContext.getHeaders() != null) {
            Map<String, String> headers = httpContext.getHeaders();
            awsJsonWriter.name("headers");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                String value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    awsJsonWriter.value(value);
                }
            }
            awsJsonWriter.endObject();
        }
        if (httpContext.getQueryString() != null) {
            String queryString = httpContext.getQueryString();
            awsJsonWriter.name("queryString");
            awsJsonWriter.value(queryString);
        }
        awsJsonWriter.endObject();
    }
}
