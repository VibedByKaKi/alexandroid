package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AnalyticsMetadataType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AnalyticsMetadataTypeJsonMarshaller {
    private static AnalyticsMetadataTypeJsonMarshaller instance;

    public static AnalyticsMetadataTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AnalyticsMetadataTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AnalyticsMetadataType analyticsMetadataType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (analyticsMetadataType.getAnalyticsEndpointId() != null) {
            String analyticsEndpointId = analyticsMetadataType.getAnalyticsEndpointId();
            awsJsonWriter.name("AnalyticsEndpointId");
            awsJsonWriter.value(analyticsEndpointId);
        }
        awsJsonWriter.endObject();
    }
}
