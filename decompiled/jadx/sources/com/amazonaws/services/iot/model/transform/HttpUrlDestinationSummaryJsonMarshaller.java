package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.HttpUrlDestinationSummary;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class HttpUrlDestinationSummaryJsonMarshaller {
    private static HttpUrlDestinationSummaryJsonMarshaller instance;

    public static HttpUrlDestinationSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HttpUrlDestinationSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HttpUrlDestinationSummary httpUrlDestinationSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (httpUrlDestinationSummary.getConfirmationUrl() != null) {
            String confirmationUrl = httpUrlDestinationSummary.getConfirmationUrl();
            awsJsonWriter.name("confirmationUrl");
            awsJsonWriter.value(confirmationUrl);
        }
        awsJsonWriter.endObject();
    }
}
