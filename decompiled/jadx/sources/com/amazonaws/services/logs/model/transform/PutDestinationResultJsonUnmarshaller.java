package com.amazonaws.services.logs.model.transform;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazonaws.services.logs.model.PutDestinationResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutDestinationResultJsonUnmarshaller implements Unmarshaller<PutDestinationResult, JsonUnmarshallerContext> {
    private static PutDestinationResultJsonUnmarshaller instance;

    public static PutDestinationResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PutDestinationResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PutDestinationResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        PutDestinationResult putDestinationResult = new PutDestinationResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY)) {
                putDestinationResult.setDestination(DestinationJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return putDestinationResult;
    }
}
