package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ProvisioningTemplateVersionSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ProvisioningTemplateVersionSummaryJsonMarshaller {
    private static ProvisioningTemplateVersionSummaryJsonMarshaller instance;

    public static ProvisioningTemplateVersionSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProvisioningTemplateVersionSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProvisioningTemplateVersionSummary provisioningTemplateVersionSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (provisioningTemplateVersionSummary.getVersionId() != null) {
            Integer versionId = provisioningTemplateVersionSummary.getVersionId();
            awsJsonWriter.name("versionId");
            awsJsonWriter.value(versionId);
        }
        if (provisioningTemplateVersionSummary.getCreationDate() != null) {
            Date creationDate = provisioningTemplateVersionSummary.getCreationDate();
            awsJsonWriter.name("creationDate");
            awsJsonWriter.value(creationDate);
        }
        if (provisioningTemplateVersionSummary.getIsDefaultVersion() != null) {
            Boolean isDefaultVersion = provisioningTemplateVersionSummary.getIsDefaultVersion();
            awsJsonWriter.name("isDefaultVersion");
            awsJsonWriter.value(isDefaultVersion.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
