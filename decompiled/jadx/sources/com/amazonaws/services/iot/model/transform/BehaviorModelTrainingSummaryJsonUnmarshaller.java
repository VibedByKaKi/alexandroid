package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.BehaviorModelTrainingSummary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class BehaviorModelTrainingSummaryJsonUnmarshaller implements Unmarshaller<BehaviorModelTrainingSummary, JsonUnmarshallerContext> {
    private static BehaviorModelTrainingSummaryJsonUnmarshaller instance;

    public static BehaviorModelTrainingSummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new BehaviorModelTrainingSummaryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public BehaviorModelTrainingSummary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BehaviorModelTrainingSummary behaviorModelTrainingSummary = new BehaviorModelTrainingSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("securityProfileName")) {
                behaviorModelTrainingSummary.setSecurityProfileName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("behaviorName")) {
                behaviorModelTrainingSummary.setBehaviorName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("trainingDataCollectionStartDate")) {
                behaviorModelTrainingSummary.setTrainingDataCollectionStartDate(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("modelStatus")) {
                behaviorModelTrainingSummary.setModelStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("datapointsCollectionPercentage")) {
                behaviorModelTrainingSummary.setDatapointsCollectionPercentage(SimpleTypeJsonUnmarshallers.DoubleJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("lastModelRefreshDate")) {
                behaviorModelTrainingSummary.setLastModelRefreshDate(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return behaviorModelTrainingSummary;
    }
}
