package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.BehaviorModelTrainingSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class BehaviorModelTrainingSummaryJsonMarshaller {
    private static BehaviorModelTrainingSummaryJsonMarshaller instance;

    public static BehaviorModelTrainingSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new BehaviorModelTrainingSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(BehaviorModelTrainingSummary behaviorModelTrainingSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (behaviorModelTrainingSummary.getSecurityProfileName() != null) {
            String securityProfileName = behaviorModelTrainingSummary.getSecurityProfileName();
            awsJsonWriter.name("securityProfileName");
            awsJsonWriter.value(securityProfileName);
        }
        if (behaviorModelTrainingSummary.getBehaviorName() != null) {
            String behaviorName = behaviorModelTrainingSummary.getBehaviorName();
            awsJsonWriter.name("behaviorName");
            awsJsonWriter.value(behaviorName);
        }
        if (behaviorModelTrainingSummary.getTrainingDataCollectionStartDate() != null) {
            Date trainingDataCollectionStartDate = behaviorModelTrainingSummary.getTrainingDataCollectionStartDate();
            awsJsonWriter.name("trainingDataCollectionStartDate");
            awsJsonWriter.value(trainingDataCollectionStartDate);
        }
        if (behaviorModelTrainingSummary.getModelStatus() != null) {
            String modelStatus = behaviorModelTrainingSummary.getModelStatus();
            awsJsonWriter.name("modelStatus");
            awsJsonWriter.value(modelStatus);
        }
        if (behaviorModelTrainingSummary.getDatapointsCollectionPercentage() != null) {
            Double datapointsCollectionPercentage = behaviorModelTrainingSummary.getDatapointsCollectionPercentage();
            awsJsonWriter.name("datapointsCollectionPercentage");
            awsJsonWriter.value(datapointsCollectionPercentage);
        }
        if (behaviorModelTrainingSummary.getLastModelRefreshDate() != null) {
            Date lastModelRefreshDate = behaviorModelTrainingSummary.getLastModelRefreshDate();
            awsJsonWriter.name("lastModelRefreshDate");
            awsJsonWriter.value(lastModelRefreshDate);
        }
        awsJsonWriter.endObject();
    }
}
