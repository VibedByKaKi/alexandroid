package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.GetJobDocumentResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetJobDocumentResultJsonUnmarshaller implements Unmarshaller<GetJobDocumentResult, JsonUnmarshallerContext> {
    private static GetJobDocumentResultJsonUnmarshaller instance;

    public static GetJobDocumentResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetJobDocumentResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetJobDocumentResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetJobDocumentResult getJobDocumentResult = new GetJobDocumentResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("document")) {
                getJobDocumentResult.setDocument(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getJobDocumentResult;
    }
}
