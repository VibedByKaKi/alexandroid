package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.EventRiskType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class EventRiskTypeJsonMarshaller {
    private static EventRiskTypeJsonMarshaller instance;

    public static EventRiskTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EventRiskTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EventRiskType eventRiskType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (eventRiskType.getRiskDecision() != null) {
            String riskDecision = eventRiskType.getRiskDecision();
            awsJsonWriter.name("RiskDecision");
            awsJsonWriter.value(riskDecision);
        }
        if (eventRiskType.getRiskLevel() != null) {
            String riskLevel = eventRiskType.getRiskLevel();
            awsJsonWriter.name("RiskLevel");
            awsJsonWriter.value(riskLevel);
        }
        if (eventRiskType.getCompromisedCredentialsDetected() != null) {
            Boolean compromisedCredentialsDetected = eventRiskType.getCompromisedCredentialsDetected();
            awsJsonWriter.name("CompromisedCredentialsDetected");
            awsJsonWriter.value(compromisedCredentialsDetected.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
