package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DomainConfigurationSummary;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DomainConfigurationSummaryJsonMarshaller {
    private static DomainConfigurationSummaryJsonMarshaller instance;

    public static DomainConfigurationSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DomainConfigurationSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DomainConfigurationSummary domainConfigurationSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (domainConfigurationSummary.getDomainConfigurationName() != null) {
            String domainConfigurationName = domainConfigurationSummary.getDomainConfigurationName();
            awsJsonWriter.name("domainConfigurationName");
            awsJsonWriter.value(domainConfigurationName);
        }
        if (domainConfigurationSummary.getDomainConfigurationArn() != null) {
            String domainConfigurationArn = domainConfigurationSummary.getDomainConfigurationArn();
            awsJsonWriter.name("domainConfigurationArn");
            awsJsonWriter.value(domainConfigurationArn);
        }
        if (domainConfigurationSummary.getServiceType() != null) {
            String serviceType = domainConfigurationSummary.getServiceType();
            awsJsonWriter.name("serviceType");
            awsJsonWriter.value(serviceType);
        }
        awsJsonWriter.endObject();
    }
}
