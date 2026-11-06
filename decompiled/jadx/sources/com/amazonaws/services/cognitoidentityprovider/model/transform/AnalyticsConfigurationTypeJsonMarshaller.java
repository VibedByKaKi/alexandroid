package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AnalyticsConfigurationType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AnalyticsConfigurationTypeJsonMarshaller {
    private static AnalyticsConfigurationTypeJsonMarshaller instance;

    public static AnalyticsConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AnalyticsConfigurationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AnalyticsConfigurationType analyticsConfigurationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (analyticsConfigurationType.getApplicationId() != null) {
            String applicationId = analyticsConfigurationType.getApplicationId();
            awsJsonWriter.name("ApplicationId");
            awsJsonWriter.value(applicationId);
        }
        if (analyticsConfigurationType.getApplicationArn() != null) {
            String applicationArn = analyticsConfigurationType.getApplicationArn();
            awsJsonWriter.name("ApplicationArn");
            awsJsonWriter.value(applicationArn);
        }
        if (analyticsConfigurationType.getRoleArn() != null) {
            String roleArn = analyticsConfigurationType.getRoleArn();
            awsJsonWriter.name("RoleArn");
            awsJsonWriter.value(roleArn);
        }
        if (analyticsConfigurationType.getExternalId() != null) {
            String externalId = analyticsConfigurationType.getExternalId();
            awsJsonWriter.name("ExternalId");
            awsJsonWriter.value(externalId);
        }
        if (analyticsConfigurationType.getUserDataShared() != null) {
            Boolean userDataShared = analyticsConfigurationType.getUserDataShared();
            awsJsonWriter.name("UserDataShared");
            awsJsonWriter.value(userDataShared.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
