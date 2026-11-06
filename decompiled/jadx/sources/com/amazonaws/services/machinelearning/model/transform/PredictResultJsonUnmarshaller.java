package com.amazonaws.services.machinelearning.model.transform;

import com.amazonaws.services.machinelearning.model.PredictResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PredictResultJsonUnmarshaller implements Unmarshaller<PredictResult, JsonUnmarshallerContext> {
    private static PredictResultJsonUnmarshaller instance;

    public static PredictResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PredictResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PredictResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        PredictResult predictResult = new PredictResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Prediction")) {
                predictResult.setPrediction(PredictionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return predictResult;
    }
}
