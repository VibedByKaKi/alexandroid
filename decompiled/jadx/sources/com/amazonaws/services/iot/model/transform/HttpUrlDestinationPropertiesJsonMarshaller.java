package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.HttpUrlDestinationProperties;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class HttpUrlDestinationPropertiesJsonMarshaller {
    private static HttpUrlDestinationPropertiesJsonMarshaller instance;

    public static HttpUrlDestinationPropertiesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HttpUrlDestinationPropertiesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HttpUrlDestinationProperties httpUrlDestinationProperties, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (httpUrlDestinationProperties.getConfirmationUrl() != null) {
            String confirmationUrl = httpUrlDestinationProperties.getConfirmationUrl();
            awsJsonWriter.name("confirmationUrl");
            awsJsonWriter.value(confirmationUrl);
        }
        awsJsonWriter.endObject();
    }
}
