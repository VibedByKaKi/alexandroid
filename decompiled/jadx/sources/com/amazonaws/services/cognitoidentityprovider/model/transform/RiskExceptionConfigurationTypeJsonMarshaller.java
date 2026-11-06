package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.RiskExceptionConfigurationType;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RiskExceptionConfigurationTypeJsonMarshaller {
    private static RiskExceptionConfigurationTypeJsonMarshaller instance;

    public static RiskExceptionConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RiskExceptionConfigurationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RiskExceptionConfigurationType riskExceptionConfigurationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (riskExceptionConfigurationType.getBlockedIPRangeList() != null) {
            List<String> blockedIPRangeList = riskExceptionConfigurationType.getBlockedIPRangeList();
            awsJsonWriter.name("BlockedIPRangeList");
            awsJsonWriter.beginArray();
            for (String str : blockedIPRangeList) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (riskExceptionConfigurationType.getSkippedIPRangeList() != null) {
            List<String> skippedIPRangeList = riskExceptionConfigurationType.getSkippedIPRangeList();
            awsJsonWriter.name("SkippedIPRangeList");
            awsJsonWriter.beginArray();
            for (String str2 : skippedIPRangeList) {
                if (str2 != null) {
                    awsJsonWriter.value(str2);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
