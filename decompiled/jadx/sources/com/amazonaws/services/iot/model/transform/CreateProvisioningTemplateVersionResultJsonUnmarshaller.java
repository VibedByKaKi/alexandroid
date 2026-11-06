package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CreateProvisioningTemplateVersionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateProvisioningTemplateVersionResultJsonUnmarshaller implements Unmarshaller<CreateProvisioningTemplateVersionResult, JsonUnmarshallerContext> {
    private static CreateProvisioningTemplateVersionResultJsonUnmarshaller instance;

    public static CreateProvisioningTemplateVersionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateProvisioningTemplateVersionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateProvisioningTemplateVersionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateProvisioningTemplateVersionResult createProvisioningTemplateVersionResult = new CreateProvisioningTemplateVersionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("templateArn")) {
                createProvisioningTemplateVersionResult.setTemplateArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("templateName")) {
                createProvisioningTemplateVersionResult.setTemplateName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("versionId")) {
                createProvisioningTemplateVersionResult.setVersionId(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("isDefaultVersion")) {
                createProvisioningTemplateVersionResult.setIsDefaultVersion(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createProvisioningTemplateVersionResult;
    }
}
