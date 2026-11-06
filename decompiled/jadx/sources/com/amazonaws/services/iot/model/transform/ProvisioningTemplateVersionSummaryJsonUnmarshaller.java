package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ProvisioningTemplateVersionSummary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ProvisioningTemplateVersionSummaryJsonUnmarshaller implements Unmarshaller<ProvisioningTemplateVersionSummary, JsonUnmarshallerContext> {
    private static ProvisioningTemplateVersionSummaryJsonUnmarshaller instance;

    public static ProvisioningTemplateVersionSummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ProvisioningTemplateVersionSummaryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ProvisioningTemplateVersionSummary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProvisioningTemplateVersionSummary provisioningTemplateVersionSummary = new ProvisioningTemplateVersionSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("versionId")) {
                provisioningTemplateVersionSummary.setVersionId(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("creationDate")) {
                provisioningTemplateVersionSummary.setCreationDate(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("isDefaultVersion")) {
                provisioningTemplateVersionSummary.setIsDefaultVersion(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return provisioningTemplateVersionSummary;
    }
}
