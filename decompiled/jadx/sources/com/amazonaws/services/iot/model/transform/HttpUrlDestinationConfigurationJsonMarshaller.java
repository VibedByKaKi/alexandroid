package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.HttpUrlDestinationConfiguration;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class HttpUrlDestinationConfigurationJsonMarshaller {
    private static HttpUrlDestinationConfigurationJsonMarshaller instance;

    public static HttpUrlDestinationConfigurationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HttpUrlDestinationConfigurationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HttpUrlDestinationConfiguration httpUrlDestinationConfiguration, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (httpUrlDestinationConfiguration.getConfirmationUrl() != null) {
            String confirmationUrl = httpUrlDestinationConfiguration.getConfirmationUrl();
            awsJsonWriter.name("confirmationUrl");
            awsJsonWriter.value(confirmationUrl);
        }
        awsJsonWriter.endObject();
    }
}
