package com.amazonaws.services.machinelearning.model.transform;

import com.amazonaws.services.machinelearning.model.Prediction;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PredictionJsonMarshaller {
    private static PredictionJsonMarshaller instance;

    public static PredictionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PredictionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Prediction prediction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (prediction.getPredictedLabel() != null) {
            String predictedLabel = prediction.getPredictedLabel();
            awsJsonWriter.name("predictedLabel");
            awsJsonWriter.value(predictedLabel);
        }
        if (prediction.getPredictedValue() != null) {
            Float predictedValue = prediction.getPredictedValue();
            awsJsonWriter.name("predictedValue");
            awsJsonWriter.value(predictedValue);
        }
        if (prediction.getPredictedScores() != null) {
            Map<String, Float> predictedScores = prediction.getPredictedScores();
            awsJsonWriter.name("predictedScores");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, Float> entry : predictedScores.entrySet()) {
                Float value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    awsJsonWriter.value(value);
                }
            }
            awsJsonWriter.endObject();
        }
        if (prediction.getDetails() != null) {
            Map<String, String> details = prediction.getDetails();
            awsJsonWriter.name("details");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, String> entry2 : details.entrySet()) {
                String value2 = entry2.getValue();
                if (value2 != null) {
                    awsJsonWriter.name(entry2.getKey());
                    awsJsonWriter.value(value2);
                }
            }
            awsJsonWriter.endObject();
        }
        awsJsonWriter.endObject();
    }
}
