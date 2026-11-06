package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CreateProvisioningTemplateResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateProvisioningTemplateResultJsonUnmarshaller implements Unmarshaller<CreateProvisioningTemplateResult, JsonUnmarshallerContext> {
    private static CreateProvisioningTemplateResultJsonUnmarshaller instance;

    public static CreateProvisioningTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateProvisioningTemplateResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateProvisioningTemplateResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateProvisioningTemplateResult createProvisioningTemplateResult = new CreateProvisioningTemplateResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("templateArn")) {
                createProvisioningTemplateResult.setTemplateArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("templateName")) {
                createProvisioningTemplateResult.setTemplateName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("defaultVersionId")) {
                createProvisioningTemplateResult.setDefaultVersionId(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createProvisioningTemplateResult;
    }
}
