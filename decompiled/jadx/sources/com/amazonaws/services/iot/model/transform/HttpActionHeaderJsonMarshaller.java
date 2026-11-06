package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.HttpActionHeader;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class HttpActionHeaderJsonMarshaller {
    private static HttpActionHeaderJsonMarshaller instance;

    public static HttpActionHeaderJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HttpActionHeaderJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HttpActionHeader httpActionHeader, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (httpActionHeader.getKey() != null) {
            String key = httpActionHeader.getKey();
            awsJsonWriter.name("key");
            awsJsonWriter.value(key);
        }
        if (httpActionHeader.getValue() != null) {
            String value = httpActionHeader.getValue();
            awsJsonWriter.name("value");
            awsJsonWriter.value(value);
        }
        awsJsonWriter.endObject();
    }
}
