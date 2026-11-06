package com.amazonaws.services.machinelearning.model.transform;

import com.amazon.alexa.assetManagementService.model.constants.AssetUrlMappingTableConstants;
import com.amazonaws.services.machinelearning.model.RealtimeEndpointInfo;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RealtimeEndpointInfoJsonUnmarshaller implements Unmarshaller<RealtimeEndpointInfo, JsonUnmarshallerContext> {
    private static RealtimeEndpointInfoJsonUnmarshaller instance;

    public static RealtimeEndpointInfoJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RealtimeEndpointInfoJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RealtimeEndpointInfo unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RealtimeEndpointInfo realtimeEndpointInfo = new RealtimeEndpointInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("PeakRequestsPerSecond")) {
                realtimeEndpointInfo.setPeakRequestsPerSecond(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(AssetUrlMappingTableConstants.CREATED_AT_COLUMN_NAME)) {
                realtimeEndpointInfo.setCreatedAt(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("EndpointUrl")) {
                realtimeEndpointInfo.setEndpointUrl(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("EndpointStatus")) {
                realtimeEndpointInfo.setEndpointStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realtimeEndpointInfo;
    }
}
