package com.amazonaws.services.machinelearning.model.transform;

import com.amazon.alexa.assetManagementService.model.constants.AssetUrlMappingTableConstants;
import com.amazonaws.services.machinelearning.model.RealtimeEndpointInfo;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RealtimeEndpointInfoJsonMarshaller {
    private static RealtimeEndpointInfoJsonMarshaller instance;

    public static RealtimeEndpointInfoJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RealtimeEndpointInfoJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RealtimeEndpointInfo realtimeEndpointInfo, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (realtimeEndpointInfo.getPeakRequestsPerSecond() != null) {
            Integer peakRequestsPerSecond = realtimeEndpointInfo.getPeakRequestsPerSecond();
            awsJsonWriter.name("PeakRequestsPerSecond");
            awsJsonWriter.value(peakRequestsPerSecond);
        }
        if (realtimeEndpointInfo.getCreatedAt() != null) {
            Date createdAt = realtimeEndpointInfo.getCreatedAt();
            awsJsonWriter.name(AssetUrlMappingTableConstants.CREATED_AT_COLUMN_NAME);
            awsJsonWriter.value(createdAt);
        }
        if (realtimeEndpointInfo.getEndpointUrl() != null) {
            String endpointUrl = realtimeEndpointInfo.getEndpointUrl();
            awsJsonWriter.name("EndpointUrl");
            awsJsonWriter.value(endpointUrl);
        }
        if (realtimeEndpointInfo.getEndpointStatus() != null) {
            String endpointStatus = realtimeEndpointInfo.getEndpointStatus();
            awsJsonWriter.name("EndpointStatus");
            awsJsonWriter.value(endpointStatus);
        }
        awsJsonWriter.endObject();
    }
}
