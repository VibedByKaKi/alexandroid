package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.HttpUrlDestinationSummary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class HttpUrlDestinationSummaryJsonUnmarshaller implements Unmarshaller<HttpUrlDestinationSummary, JsonUnmarshallerContext> {
    private static HttpUrlDestinationSummaryJsonUnmarshaller instance;

    public static HttpUrlDestinationSummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new HttpUrlDestinationSummaryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public HttpUrlDestinationSummary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HttpUrlDestinationSummary httpUrlDestinationSummary = new HttpUrlDestinationSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("confirmationUrl")) {
                httpUrlDestinationSummary.setConfirmationUrl(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return httpUrlDestinationSummary;
    }
}
